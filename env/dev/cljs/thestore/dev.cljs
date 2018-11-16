(ns ^:figwheel-no-load thestore.dev
  (:require
    [thestore.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
