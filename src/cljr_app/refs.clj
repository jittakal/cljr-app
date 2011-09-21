(ns cljr-app.refs)

(defn transfer
  "transfer money from one account to another account"
  [account1 account2 amount]
  (dosync   
   (alter account1 - amount)
   (alter account2 + amount)))

(defn add-contact
  "adds a contact to the provided contact list"
  [contacts contact]
  (dosync
     (alter contacts conj (ref contact))))

(defn print-contacts
  "prints a list of contacts"
  [contacts]
  (doseq [c @contacts]
    (println (str "Name: " (@c :lname) ", " (@c :fname)))))

(defn get-initials
  "this function will returns the initials"
  [fname lname]
  (str "(" (first fname) (first lname) ")"))

(defn print-contacts-with-initials
  "print a list of contacts with initials"
  [contacts]
  (doseq [c @contacts]
    (let [fname (@c :fname) lname (@c :lname)]
      (println (str "Name: " lname ", " fname " " (get-initials fname lname))))))

