(ns cljr.lang.data)

;; Numeric
;; common numeric operations
;; addition(+) - any number of numeric argument
(+ 10 10)
(+ 1 2 3 4 5)

;; substraction(-) - takes any number of numeric argument
(- 20 10)
(- 10 5 4)

;; multiplication(*) - takes any number of numeric argument
(* 5 5)
(* 1 2 3 4 5 6)

;; division(/) - takes any number of numeric argument
(/ 10) ;; 1/10
(/ 10 2)

;; inc - increment function
(inc 9)

;; dec - decrement function
(dec 11)

;; quot - the quotient function takes two arguments and returns the integer
(quot 10 5)

;; rem - reminder takes two numeric arguments and returns the remainder
(rem 10 3)

;; min
(min 10 12 4 5 6 7) ;;returns 4

;; max
(max 10 12 4 5 6 7) ;;returns 12

;; equals function (==)
(== 5 5) ;;returns true

;; greater than (<)
(< 5 10) ;;true
(< 1 2 3 4 5) ;;true
(< 5 4 3) ;;false

;; greather than or equals to (<=)
(< 10 10) ;;true
(< 5 10 10) ;;true

;; less than (>)
(> 11 10 9) ;;true
(> 10 9 11) ;;false

;; less than or equals to (>=)
(>= 11 10 10 9) ;;true
(>= 20 20 9 11) ;;false


;; zero?
(zero? 0.0) ;;true
(zero? 10) ;;false

;;pos?
(pos? 10) ;;true
(pos? -5) ;;false

;;neg?
(neg? -5) ;;true
(neg? 10) ;;flase

;;number?
(number? 5) ;;true
(number? "Hello") ;;false


;; Strings
;; str - String concatation fuction
(str "Jitendra" " " "Baban" " " "Takalkar") ;; "Jitendra Baban Takalkar"


(defn str-conc
  [fname mname lname]
  (str fname " " mname " " lname))

