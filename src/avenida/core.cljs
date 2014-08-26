(ns avenida.core
  (:require
    [dommy.core :as dommy]
    [monet.canvas :as canvas])
  (:use-macros
    [dommy.macros :only [sel1]]))

(enable-console-print!)

(println "Hello world!")

(def dom-canvas (sel1 "canvas"))

;(defn init []
;  (canvas/init dom-canvas

(defn hello-cljs []
  (let [container (sel1 :.js-content)]
    (dommy/set-text! container "Hello, Cljs!")))

(hello-cljs)
