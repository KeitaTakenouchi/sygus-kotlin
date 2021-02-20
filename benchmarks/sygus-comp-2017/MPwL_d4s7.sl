; Synthesizes a robot motion planner.
; Solution should have depth 4.  Robot takes 7 steps.
; Problem by Sarah Chasins.

(set-logic LIA)


(define-fun get-y ((currPoint Int)) Int 
(ite (< currPoint 10) 0 (ite (< currPoint 20) 1 (ite (< currPoint 30) 2 (ite (< currPoint 40) 3 (ite (< currPoint 50) 4 (ite (< currPoint 60) 5 (ite (< currPoint 70) 6 (ite (< currPoint 80) 7 (ite (< currPoint 90) 8 9))))))))))

(define-fun get-x ((currPoint Int)) Int
	(- currPoint (* (get-y currPoint) 10)))
(define-fun interpret-move (( currPoint Int ) ( move Int)) Int
(ite (= move 0) currPoint 
(ite (= move 1)  (ite (or (< (+ (get-y currPoint) 1) 0) (>= (+ (get-y currPoint) 1) 10))     currPoint (+ currPoint  10)) 
(ite (= move 2)  (ite (or (< (+ (get-x currPoint) 1) 0) (>= (+ (get-x currPoint) 1) 10))     currPoint (+ currPoint  1)) 
(ite (= move 3)  (ite (or (< (+ (get-y currPoint) -1) 0) (>= (+ (get-y currPoint) -1) 10))     currPoint (+ currPoint  -10)) 
(ite (= move 4)  (ite (or (< (+ (get-x currPoint) -1) 0) (>= (+ (get-x currPoint) -1) 10))     currPoint (+ currPoint  -1)) 
currPoint))))))

(define-fun interpret-move-obstacle-0 (( currPoint Int ) ( move Int)) Int
(ite (= move 0)  (ite (or (< (+ (get-y currPoint) 1) 0) (>= (+ (get-y currPoint) 1) 10))     currPoint (+ currPoint  10)) 
(ite (= move 1)  (ite (or (< (+ (get-y currPoint) -1) 0) (>= (+ (get-y currPoint) -1) 10))     currPoint (+ currPoint  -10)) 
currPoint)))

(define-fun interpret-move-obstacle-1 (( currPoint Int ) ( move Int)) Int
(ite (= move 0)  (ite (or (< (+ (get-y currPoint) 1) 0) (>= (+ (get-y currPoint) 1) 10))     currPoint (+ currPoint  10)) 
(ite (= move 1) currPoint 
(ite (= move 2)  (ite (or (< (+ (get-y currPoint) -1) 0) (>= (+ (get-y currPoint) -1) 10))     currPoint (+ currPoint  -10)) 
currPoint))))

(define-fun allowable-move-obstacle-0 (( start Int ) ( end Int)) Bool
	(or (= (interpret-move-obstacle-0 start 0) end)
	(or (= (interpret-move-obstacle-0 start 1) end) false)))

(define-fun allowable-move-obstacle-1 (( start Int ) ( end Int)) Bool
	(or (= (interpret-move-obstacle-1 start 0) end)
	(or (= (interpret-move-obstacle-1 start 1) end)
	(or (= (interpret-move-obstacle-1 start 2) end) false))))

(define-fun get-move-obstacle-0 (( start Int ) ( end Int)) Int
	(ite (= (interpret-move-obstacle-0 start 0) end) 0 
	(ite (= (interpret-move-obstacle-0 start 1) end) 1  -1)))

(define-fun get-move-obstacle-1 (( start Int ) ( end Int)) Int
	(ite (= (interpret-move-obstacle-1 start 0) end) 0 
	(ite (= (interpret-move-obstacle-1 start 1) end) 1 
	(ite (= (interpret-move-obstacle-1 start 2) end) 2  -1))))

(define-fun no-overlap-one-move-combination-2-2 ((p0 Int) (p1 Int) (p2 Int) (p3 Int)) Bool
	(and (not (= p0 p2)) (and (not (= p0 p3)) (and (not (= p1 p2)) (and (not (= p1 p3)) true)))))

(define-fun no-overlaps-0 (( currPoint Int ) ( move Int) (obstacleCurrPoint Int) (obstacleMove Int)) Bool
	(= 1
	(ite (= move 0) 
		(ite (= obstacleMove 0) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 10)) 1 0)
		(ite (= obstacleMove 1) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) -10)) 1 0) 0))
	(ite (= move 1) 
		(ite (= obstacleMove 0) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) 10) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 10)) 1 0)
		(ite (= obstacleMove 1) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) 10) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) -10)) 1 0) 0))
	(ite (= move 2) 
		(ite (= obstacleMove 0) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 1) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 10)) 1 0)
		(ite (= obstacleMove 1) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 1) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) -10)) 1 0) 0))
	(ite (= move 3) 
		(ite (= obstacleMove 0) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) -10) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 10)) 1 0)
		(ite (= obstacleMove 1) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) -10) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) -10)) 1 0) 0))
	(ite (= move 4) 
		(ite (= obstacleMove 0) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint -1) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 10)) 1 0)
		(ite (= obstacleMove 1) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint -1) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) -10)) 1 0) 0)) 0)))))))

(define-fun no-overlaps-1 (( currPoint Int ) ( move Int) (obstacleCurrPoint Int) (obstacleMove Int)) Bool
	(= 1
	(ite (= move 0) 
		(ite (= obstacleMove 0) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 10)) 1 0)
		(ite (= obstacleMove 1) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 0)) 1 0)
		(ite (= obstacleMove 2) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) -10)) 1 0) 0)))
	(ite (= move 1) 
		(ite (= obstacleMove 0) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) 10) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 10)) 1 0)
		(ite (= obstacleMove 1) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) 10) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 0)) 1 0)
		(ite (= obstacleMove 2) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) 10) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) -10)) 1 0) 0)))
	(ite (= move 2) 
		(ite (= obstacleMove 0) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 1) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 10)) 1 0)
		(ite (= obstacleMove 1) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 1) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 0)) 1 0)
		(ite (= obstacleMove 2) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 1) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) -10)) 1 0) 0)))
	(ite (= move 3) 
		(ite (= obstacleMove 0) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) -10) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 10)) 1 0)
		(ite (= obstacleMove 1) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) -10) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 0)) 1 0)
		(ite (= obstacleMove 2) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint 0) -10) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) -10)) 1 0) 0)))
	(ite (= move 4) 
		(ite (= obstacleMove 0) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint -1) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 10)) 1 0)
		(ite (= obstacleMove 1) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint -1) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) 0)) 1 0)
		(ite (= obstacleMove 2) (ite (no-overlap-one-move-combination-2-2 currPoint (+ (+ currPoint -1) 0) obstacleCurrPoint (+ (+ obstacleCurrPoint 0) -10)) 1 0) 0))) 0)))))))

(define-fun no-overlaps-one-step-helper ((currPoint Int) (move Int) (o0-t Int) (o0move Int) (o1-t Int) (o1move Int)) Bool
	(and (no-overlaps-0 currPoint move o0-t o0move) (and (no-overlaps-1 currPoint move o1-t o1move) true)))

(define-fun no-overlaps-one-step ((currPoint Int) (move Int)  (o0-0 Int) (o0-1 Int) (o1-0 Int) (o1-1 Int)) Bool
	(no-overlaps-one-step-helper currPoint move o0-0 (get-move-obstacle-0 o0-0 o0-1) o1-0 (get-move-obstacle-1 o1-0 o1-1)))



(declare-var o0-1 Int)
(declare-var o0-2 Int)
(declare-var o0-3 Int)
(declare-var o0-4 Int)
(declare-var o0-5 Int)
(declare-var o0-6 Int)
(declare-var o0-7 Int)
(declare-var o1-1 Int)
(declare-var o1-2 Int)
(declare-var o1-3 Int)
(declare-var o1-4 Int)
(declare-var o1-5 Int)
(declare-var o1-6 Int)
(declare-var o1-7 Int)

(synth-fun move ((currPoint Int) (o0 Int) (o1 Int)) Int
	((Start Int (
		MoveId
		(ite StartBool Start Start)))
    (MoveId Int (0
		1
		2
		3
		4
  	))
	(CondInt Int (
		(get-y currPoint) ;y coord
		(get-x currPoint) ;x coord
		(get-y o0)
		(get-x o0)
		(get-y o1)
		(get-x o1)
		(+ CondInt CondInt)
		(- CondInt CondInt)
		-1
		0
		1
		2
		3
		4
		5
		6
		7
		8
		9
				))
	(StartBool Bool ((and StartBool StartBool)
		(or  StartBool StartBool)
		(not StartBool)
		(<=  CondInt CondInt)
		(=   CondInt CondInt)
		(>=  CondInt CondInt))))) 
 
 (constraint  (let ((pos0 Int 0)) (let ((mov0 Int (move pos0 99 98))) (let ((pos1 Int (interpret-move pos0 mov0))) (let ((mov1 Int (move pos1 o0-1 o1-1))) (let ((pos2 Int (interpret-move pos1 mov1))) (let ((mov2 Int (move pos2 o0-2 o1-2))) (let ((pos3 Int (interpret-move pos2 mov2))) (let ((mov3 Int (move pos3 o0-3 o1-3))) (let ((pos4 Int (interpret-move pos3 mov3))) (let ((mov4 Int (move pos4 o0-4 o1-4))) (let ((pos5 Int (interpret-move pos4 mov4))) (let ((mov5 Int (move pos5 o0-5 o1-5))) (let ((pos6 Int (interpret-move pos5 mov5))) (let ((mov6 Int (move pos6 o0-6 o1-6))) (let ((pos7 Int (interpret-move pos6 mov6)))
 (or 
	(and
		(= pos7 61)
		(and (no-overlaps-one-step pos0 mov0 99 o0-1 98 o1-1) (and (no-overlaps-one-step pos1 mov1 o0-1 o0-2 o1-1 o1-2) (and (no-overlaps-one-step pos2 mov2 o0-2 o0-3 o1-2 o1-3) (and (no-overlaps-one-step pos3 mov3 o0-3 o0-4 o1-3 o1-4) (and (no-overlaps-one-step pos4 mov4 o0-4 o0-5 o1-4 o1-5) (and (no-overlaps-one-step pos5 mov5 o0-5 o0-6 o1-5 o1-6) (and (no-overlaps-one-step pos6 mov6 o0-6 o0-7 o1-6 o1-7) true))))))))
	(not (and (allowable-move-obstacle-0 99 o0-1) (and (allowable-move-obstacle-0 o0-1 o0-2) (and (allowable-move-obstacle-0 o0-2 o0-3) (and (allowable-move-obstacle-0 o0-3 o0-4) (and (allowable-move-obstacle-0 o0-4 o0-5) (and (allowable-move-obstacle-0 o0-5 o0-6) (and (allowable-move-obstacle-0 o0-6 o0-7) (and (allowable-move-obstacle-1 98 o1-1) (and (allowable-move-obstacle-1 o1-1 o1-2) (and (allowable-move-obstacle-1 o1-2 o1-3) (and (allowable-move-obstacle-1 o1-3 o1-4) (and (allowable-move-obstacle-1 o1-4 o1-5) (and (allowable-move-obstacle-1 o1-5 o1-6) (and (allowable-move-obstacle-1 o1-6 o1-7) true))))))))))))))))))))))))))))))))

(check-synth)