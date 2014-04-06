{:namespaces
 ({:source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url "http://clojure.github.com/clojure/clojure.core-api.html",
   :name "clojure.core",
   :doc "Fundamental library of the Clojure language"}
  {:source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/inspector.clj",
   :wiki-url
   "http://clojure.github.com/clojure/clojure.inspector-api.html",
   :name "clojure.inspector",
   :author "Rich Hickey",
   :doc "Graphical object inspector for Clojure data structures."}
  {:source-url
   "https://github.com/clojure/clojure/blob/fbe0183713b92b2f96a68e2a0d0d654bb7ce93ff/src/clj/clojure/java/browse.clj",
   :wiki-url
   "http://clojure.github.com/clojure/clojure.java.browse-api.html",
   :name "clojure.java.browse",
   :author "Christophe Grand",
   :doc "Start a web browser from Clojure"}
  {:source-url
   "https://github.com/clojure/clojure/blob/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj",
   :wiki-url
   "http://clojure.github.com/clojure/clojure.java.io-api.html",
   :name "clojure.java.io",
   :author "Stuart Sierra, Chas Emerick, Stuart Halloway",
   :doc
   "This file defines polymorphic I/O utility functions for Clojure."}
  {:source-url
   "https://github.com/clojure/clojure/blob/89ed54ec8850bb3012c89c91d076a34837ca737e/src/clj/clojure/java/javadoc.clj",
   :wiki-url
   "http://clojure.github.com/clojure/clojure.java.javadoc-api.html",
   :name "clojure.java.javadoc",
   :author "Christophe Grand, Stuart Sierra",
   :doc "A repl helper to quickly open javadocs."}
  {:source-url
   "https://github.com/clojure/clojure/blob/a2c95ef1bf6e34a455b469ac9ff18ddff7e9cef7/src/clj/clojure/java/shell.clj",
   :wiki-url
   "http://clojure.github.com/clojure/clojure.java.shell-api.html",
   :name "clojure.java.shell",
   :author "Chris Houser, Stuart Halloway",
   :doc
   "Conveniently launch a sub-process providing its stdin and\ncollecting its stdout"}
  {:source-url
   "https://github.com/clojure/clojure/blob/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj",
   :wiki-url "http://clojure.github.com/clojure/clojure.main-api.html",
   :name "clojure.main",
   :doc nil}
  {:source-url
   "https://github.com/clojure/clojure/blob/10f849fad0d8e61b5c8a47075a34ca78a0ffc298/src/clj/clojure/pprint.clj",
   :wiki-url
   "http://clojure.github.com/clojure/clojure.pprint-api.html",
   :name "clojure.pprint",
   :author "Tom Faulhaber",
   :doc
   "A Pretty Printer for Clojure\n\nclojure.pprint implements a flexible system for printing structured data\nin a pleasing, easy-to-understand format. Basic use of the pretty printer is \nsimple, just call pprint instead of println. More advanced users can use \nthe building blocks provided to create custom output formats. \n\nOut of the box, pprint supports a simple structured format for basic data \nand a specialized format for Clojure source code. More advanced formats, \nincluding formats that don't look like Clojure data at all like XML and \nJSON, can be rendered by creating custom dispatch functions. \n\nIn addition to the pprint function, this module contains cl-format, a text \nformatting function which is fully compatible with the format function in \nCommon Lisp. Because pretty printing directives are directly integrated with\ncl-format, it supports very concise custom dispatch. It also provides\na more powerful alternative to Clojure's standard format function.\n\nSee documentation for pprint and cl-format for more information or \ncomplete documentation on the the clojure web site on github."}
  {:source-url
   "https://github.com/clojure/clojure/blob/40f3dc93b926721e94b75a10a9c88815ea4691aa/src/clj/clojure/repl.clj",
   :wiki-url "http://clojure.github.com/clojure/clojure.repl-api.html",
   :name "clojure.repl",
   :author
   "Chris Houser, Christophe Grand, Stephen Gilardi, Michel Salim, Christophe Grande",
   :doc "Utilities meant to be used interactively at the REPL"}
  {:source-url
   "https://github.com/clojure/clojure/blob/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj",
   :wiki-url "http://clojure.github.com/clojure/clojure.set-api.html",
   :name "clojure.set",
   :author "Rich Hickey",
   :doc "Set operations such as union/intersection."}
  {:source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/stacktrace.clj",
   :wiki-url
   "http://clojure.github.com/clojure/clojure.stacktrace-api.html",
   :name "clojure.stacktrace",
   :author "Stuart Sierra",
   :doc "Print stack traces oriented towards Clojure, not Java."}
  {:source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure/clojure.string-api.html",
   :name "clojure.string",
   :author "Stuart Sierra, Stuart Halloway, David Liebke",
   :doc
   "Clojure String utilities\n\nIt is poor form to (:use clojure.string). Instead, use require\nwith :as to specify a prefix, e.g.\n\n(ns your.namespace.here\n  (:require '[clojure.string :as str]))\n\nDesign notes for clojure.string:\n\n1. Strings are objects (as opposed to sequences). As such, the\n   string being manipulated is the first argument to a function;\n   passing nil will result in a NullPointerException unless\n   documented otherwise. If you want sequence-y behavior instead,\n   use a sequence.\n\n2. Functions are generally not lazy, and call straight to host\n   methods where those are available and efficient.\n\n3. Functions take advantage of String implementation details to\n   write high-performing loop/recurs instead of using higher-order\n   functions. (This is not idiomatic in general-purpose application\n   code.)\n\n4. When a function is documented to accept a string argument, it\n   will take any implementation of the correct *interface* on the\n   host platform. In Java, this is CharSequence, which is more\n   general than String. In ordinary usage you will almost always\n   pass concrete strings. If you are doing something unusual,\n   e.g. passing a mutable implementation of CharSequence, then\n   thead-safety is your responsibility."}
  {:source-url
   "https://github.com/clojure/clojure/blob/787938361128c2bc21ed896dd4523651b59cb420/src/clj/clojure/template.clj",
   :wiki-url
   "http://clojure.github.com/clojure/clojure.template-api.html",
   :name "clojure.template",
   :author "Stuart Sierra",
   :doc
   "Macros that expand to repeated copies of a template expression."}
  {:source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url "http://clojure.github.com/clojure/clojure.test-api.html",
   :name "clojure.test",
   :author
   "Stuart Sierra, with contributions and suggestions by \n  Chas Emerick, Allen Rohner, and Stuart Halloway",
   :doc
   "A unit testing framework.\n\nASSERTIONS\n\nThe core of the library is the \"is\" macro, which lets you make\nassertions of any arbitrary expression:\n\n(is (= 4 (+ 2 2)))\n(is (instance? Integer 256))\n(is (.startsWith \"abcde\" \"ab\"))\n\nYou can type an \"is\" expression directly at the REPL, which will\nprint a message if it fails.\n\n    user> (is (= 5 (+ 2 2)))\n\n    FAIL in  (:1)\n    expected: (= 5 (+ 2 2))\n      actual: (not (= 5 4))\n    false\n\nThe \"expected:\" line shows you the original expression, and the\n\"actual:\" shows you what actually happened.  In this case, it\nshows that (+ 2 2) returned 4, which is not = to 5.  Finally, the\n\"false\" on the last line is the value returned from the\nexpression.  The \"is\" macro always returns the result of the\ninner expression.\n\nThere are two special assertions for testing exceptions.  The\n\"(is (thrown? c ...))\" form tests if an exception of class c is\nthrown:\n\n(is (thrown? ArithmeticException (/ 1 0))) \n\n\"(is (thrown-with-msg? c re ...))\" does the same thing and also\ntests that the message on the exception matches the regular\nexpression re:\n\n(is (thrown-with-msg? ArithmeticException #\"Divide by zero\"\n                      (/ 1 0)))\n\nDOCUMENTING TESTS\n\n\"is\" takes an optional second argument, a string describing the\nassertion.  This message will be included in the error report.\n\n(is (= 5 (+ 2 2)) \"Crazy arithmetic\")\n\nIn addition, you can document groups of assertions with the\n\"testing\" macro, which takes a string followed by any number of\nassertions.  The string will be included in failure reports.\nCalls to \"testing\" may be nested, and all of the strings will be\njoined together with spaces in the final report, in a style\nsimilar to RSpec <http://rspec.info/>\n\n(testing \"Arithmetic\"\n  (testing \"with positive integers\"\n    (is (= 4 (+ 2 2)))\n    (is (= 7 (+ 3 4))))\n  (testing \"with negative integers\"\n    (is (= -4 (+ -2 -2)))\n    (is (= -1 (+ 3 -4)))))\n\nNote that, unlike RSpec, the \"testing\" macro may only be used\nINSIDE a \"deftest\" or \"with-test\" form (see below).\n\n\nDEFINING TESTS\n\nThere are two ways to define tests.  The \"with-test\" macro takes\na defn or def form as its first argument, followed by any number\nof assertions.  The tests will be stored as metadata on the\ndefinition.\n\n(with-test\n    (defn my-function [x y]\n      (+ x y))\n  (is (= 4 (my-function 2 2)))\n  (is (= 7 (my-function 3 4))))\n\nAs of Clojure SVN rev. 1221, this does not work with defmacro.\nSee http://code.google.com/p/clojure/issues/detail?id=51\n\nThe other way lets you define tests separately from the rest of\nyour code, even in a different namespace:\n\n(deftest addition\n  (is (= 4 (+ 2 2)))\n  (is (= 7 (+ 3 4))))\n\n(deftest subtraction\n  (is (= 1 (- 4 3)))\n  (is (= 3 (- 7 4))))\n\nThis creates functions named \"addition\" and \"subtraction\", which\ncan be called like any other function.  Therefore, tests can be\ngrouped and composed, in a style similar to the test framework in\nPeter Seibel's \"Practical Common Lisp\"\n<http://www.gigamonkeys.com/book/practical-building-a-unit-test-framework.html>\n\n(deftest arithmetic\n  (addition)\n  (subtraction))\n\nThe names of the nested tests will be joined in a list, like\n\"(arithmetic addition)\", in failure reports.  You can use nested\ntests to set up a context shared by several tests.\n\n\nRUNNING TESTS\n\nRun tests with the function \"(run-tests namespaces...)\":\n\n(run-tests 'your.namespace 'some.other.namespace)\n\nIf you don't specify any namespaces, the current namespace is\nused.  To run all tests in all namespaces, use \"(run-all-tests)\".\n\nBy default, these functions will search for all tests defined in\na namespace and run them in an undefined order.  However, if you\nare composing tests, as in the \"arithmetic\" example above, you\nprobably do not want the \"addition\" and \"subtraction\" tests run\nseparately.  In that case, you must define a special function\nnamed \"test-ns-hook\" that runs your tests in the correct order:\n\n(defn test-ns-hook []\n  (arithmetic))\n\n\nOMITTING TESTS FROM PRODUCTION CODE\n\nYou can bind the variable \"*load-tests*\" to false when loading or\ncompiling code in production.  This will prevent any tests from\nbeing created by \"with-test\" or \"deftest\".\n\n\nFIXTURES (new)\n\nFixtures allow you to run code before and after tests, to set up\nthe context in which tests should be run.\n\nA fixture is just a function that calls another function passed as\nan argument.  It looks like this:\n\n(defn my-fixture [f]\n   Perform setup, establish bindings, whatever.\n  (f)  Then call the function we were passed.\n   Tear-down / clean-up code here.\n )\n\nFixtures are attached to namespaces in one of two ways.  \"each\"\nfixtures are run repeatedly, once for each test function created\nwith \"deftest\" or \"with-test\".  \"each\" fixtures are useful for\nestablishing a consistent before/after state for each test, like\nclearing out database tables.\n\n\"each\" fixtures can be attached to the current namespace like this:\n(use-fixtures :each fixture1 fixture2 ...)\nThe fixture1, fixture2 are just functions like the example above.\nThey can also be anonymous functions, like this:\n(use-fixtures :each (fn [f] setup... (f) cleanup...))\n\nThe other kind of fixture, a \"once\" fixture, is only run once,\naround ALL the tests in the namespace.  \"once\" fixtures are useful\nfor tasks that only need to be performed once, like establishing\ndatabase connections, or for time-consuming tasks.\n\nAttach \"once\" fixtures to the current namespace like this:\n(use-fixtures :once fixture1 fixture2 ...)\n\n\nSAVING TEST OUTPUT TO A FILE\n\nAll the test reporting functions write to the var *test-out*.  By\ndefault, this is the same as *out*, but you can rebind it to any\nPrintWriter.  For example, it could be a file opened with\nclojure.java.io/writer.\n\n\nEXTENDING TEST-IS (ADVANCED)\n\nYou can extend the behavior of the \"is\" macro by defining new\nmethods for the \"assert-expr\" multimethod.  These methods are\ncalled during expansion of the \"is\" macro, so they should return\nquoted forms to be evaluated.\n\nYou can plug in your own test-reporting framework by rebinding\nthe \"report\" function: (report event)\n\nThe 'event' argument is a map.  It will always have a :type key,\nwhose value will be a keyword signaling the type of event being\nreported.  Standard events with :type value of :pass, :fail, and\n:error are called when an assertion passes, fails, and throws an\nexception, respectively.  In that case, the event will also have\nthe following keys:\n\n  :expected   The form that was expected to be true\n  :actual     A form representing what actually occurred\n  :message    The string message given as an argument to 'is'\n\nThe \"testing\" strings will be a list in \"*testing-contexts*\", and\nthe vars being tested will be a list in \"*testing-vars*\".\n\nYour \"report\" function should wrap any printing calls in the\n\"with-test-out\" macro, which rebinds *out* to the current value\nof *test-out*.\n\nFor additional event types, see the examples in the code."}
  {:source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj",
   :wiki-url "http://clojure.github.com/clojure/clojure.walk-api.html",
   :name "clojure.walk",
   :author "Stuart Sierra",
   :doc
   "This file defines a generic tree walker for Clojure data\nstructures.  It takes any data structure (list, vector, map, set,\nseq), calls a function on every element, and uses the return value\nof the function in place of the original.  This makes it fairly\neasy to write recursive search-and-replace functions, as shown in\nthe examples.\n\nNote: \"walk\" supports all Clojure data structures EXCEPT maps\ncreated with sorted-map-by.  There is no (obvious) way to retrieve\nthe sorting function."}
  {:source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/xml.clj",
   :wiki-url "http://clojure.github.com/clojure/clojure.xml-api.html",
   :name "clojure.xml",
   :author "Rich Hickey",
   :doc "XML reading/writing."}
  {:source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url "http://clojure.github.com/clojure/clojure.zip-api.html",
   :name "clojure.zip",
   :author "Rich Hickey",
   :doc
   "Functional hierarchical zipper, with navigation, editing,\nand enumeration.  See Huet"}
  {:source-url
   "https://github.com/clojure/clojure/blob/d2fce54ccfcf46815524c2af94d1939573c1e9a9/src/clj/clojure/core/protocols.clj",
   :wiki-url
   "http://clojure.github.com/clojure/clojure.core.protocols-api.html",
   :name "clojure.core.protocols",
   :doc nil}
  {:source-url
   "https://github.com/clojure/clojure/blob/fbe0183713b92b2f96a68e2a0d0d654bb7ce93ff/src/clj/clojure/test/junit.clj",
   :wiki-url
   "http://clojure.github.com/clojure/clojure.test.junit-api.html",
   :name "clojure.test.junit",
   :author "Jason Sankey",
   :doc
   "clojure.test extension for JUnit-compatible XML output.\n\nJUnit (http://junit.org/) is the most popular unit-testing library\nfor Java.  As such, tool support for JUnit output formats is\ncommon.  By producing compatible output from tests, this tool\nsupport can be exploited.\n\nTo use, wrap any calls to clojure.test/run-tests in the\nwith-junit-output macro, like this:\n\n  (use 'clojure.test)\n  (use 'clojure.test.junit)\n\n  (with-junit-output\n    (run-tests 'my.cool.library))\n\nTo write the output to a file, rebind clojure.test/*test-out* to\nyour own PrintWriter (perhaps opened using\nclojure.java.io/writer)."}
  {:source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/test/tap.clj",
   :wiki-url
   "http://clojure.github.com/clojure/clojure.test.tap-api.html",
   :name "clojure.test.tap",
   :author "Stuart Sierra",
   :doc
   "clojure.test extensions for the Test Anything Protocol (TAP)\n\nTAP is a simple text-based syntax for reporting test results.  TAP\nwas originally develped for Perl, and now has implementations in\nseveral languages.  For more information on TAP, see\nhttp://testanything.org/ and\nhttp://search.cpan.org/~petdance/TAP-1.0.0/TAP.pm\n\nTo use this library, wrap any calls to\nclojure.test/run-tests in the with-tap-output macro,\nlike this:\n\n  (use 'clojure.test)\n  (use 'clojure.test.tap)\n\n  (with-tap-output\n   (run-tests 'my.cool.library))"}),
 :vars
 ({:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/&",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "special syntax",
   :doc
   "Syntax for use with fn.\n\nPlease see http://clojure.org/special_forms#fn",
   :name "&"}
  {:arglists ([] [x] [x y] [x y & more]),
   :name "*",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L820",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*",
   :doc "Returns the product of nums. (*) returns 1.",
   :var-type "function",
   :line 820,
   :file "src/clj/clojure/core.clj"}
  {:name "*1",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5030",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*1",
   :doc "bound in a repl thread to the most recent value printed",
   :var-type "var",
   :line 5030,
   :file "src/clj/clojure/core.clj"}
  {:name "*2",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5035",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*2",
   :doc
   "bound in a repl thread to the second most recent value printed",
   :var-type "var",
   :line 5035,
   :file "src/clj/clojure/core.clj"}
  {:name "*3",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5040",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*3",
   :doc
   "bound in a repl thread to the third most recent value printed",
   :var-type "var",
   :line 5040,
   :file "src/clj/clojure/core.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*agent*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc
   "The agent currently running an action on this thread, else nil",
   :name "*agent*"}
  {:name "*clojure-version*",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5484",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*clojure-version*",
   :doc
   "The version info for Clojure core, as a map containing :major :minor \n:incremental and :qualifier keys. Feature releases may increment \n:minor and/or :major, bugfix releases will increment :incremental. \nPossible values of :qualifier include \"GA\", \"SNAPSHOT\", \"RC-x\" \"BETA-x\"",
   :var-type "var",
   :line 5484,
   :file "src/clj/clojure/core.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*command-line-args*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc
   "A sequence of the supplied command line arguments, or nil if\nnone were supplied",
   :name "*command-line-args*"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*compile-files*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc "Set to true when compiling files, false otherwise.",
   :name "*compile-files*"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*compile-path*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc
   "Specifies the directory where 'compile' will write out .class\nfiles. This directory must be in the classpath for 'compile' to\nwork.\n\nDefaults to \"classes\"",
   :name "*compile-path*"}
  {:name "*e",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5045",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*e",
   :doc
   "bound in a repl thread to the most recent exception caught by the repl",
   :var-type "var",
   :line 5045,
   :file "src/clj/clojure/core.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*err*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc
   "A java.io.Writer object representing standard error for print operations.\n\nDefaults to System/err, wrapped in a PrintWriter",
   :name "*err*"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*file*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc
   "The path of the file being evaluated, as a String.\n\nEvaluates to nil when there is no file, eg. in the REPL.",
   :name "*file*"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*flush-on-newline*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc
   "When set to true, output will be flushed whenever a newline is printed.\n\nDefaults to true.",
   :name "*flush-on-newline*"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*in*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc
   "A java.io.Reader object representing standard input for read operations.\n\nDefaults to System/in, wrapped in a LineNumberingPushbackReader",
   :name "*in*"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*ns*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc
   "A clojure.lang.Namespace object representing the current namespace.",
   :name "*ns*"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*out*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc
   "A java.io.Writer object representing standard output for print operations.\n\nDefaults to System/out",
   :name "*out*"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*print-dup*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc
   "When set to logical true, objects will be printed in a way that preserves\ntheir type when read in later.\n\nDefaults to false.",
   :name "*print-dup*"}
  {:name "*print-length*",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/core_print.clj#L15",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/core_print.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*print-length*",
   :doc
   "*print-length* controls how many items of each collection the\nprinter will print. If it is bound to logical false, there is no\nlimit. Otherwise, it must be bound to an integer indicating the maximum\nnumber of items of each collection to print. If a collection contains\nmore items, the printer will print items up to the limit followed by\n'...' to represent the remaining items. The root binding is nil\nindicating no limit.",
   :var-type "var",
   :line 15,
   :file "src/clj/clojure/core_print.clj"}
  {:name "*print-level*",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/core_print.clj#L26",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/core_print.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*print-level*",
   :doc
   "*print-level* controls how many levels deep the printer will\nprint nested objects. If it is bound to logical false, there is no\nlimit. Otherwise, it must be bound to an integer indicating the maximum\nlevel to print. Each argument to print is at level 0; if an argument is a\ncollection, its items are at level 1; and so on. If an object is a\ncollection and is at a level greater than or equal to the value bound to\n*print-level*, the printer prints '#' to represent it. The root binding\nis nil indicating no limit.",
   :var-type "var",
   :line 26,
   :file "src/clj/clojure/core_print.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*print-meta*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc
   "If set to logical true, when printing an object, its metadata will also\nbe printed in a form that can be read back by the reader.\n\nDefaults to false.",
   :name "*print-meta*"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*print-readably*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc
   "When set to logical false, strings and characters will be printed with\nnon-alphanumeric characters converted to the appropriate escape sequences.\n\nDefaults to true",
   :name "*print-readably*"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*read-eval*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc
   "When set to logical false, the EvalReader (#=(...)) is disabled in the \nread/load in the thread-local binding.\nExample: (binding [*read-eval* false] (read-string \"#=(eval (def x 3))\"))\n\nDefaults to true",
   :name "*read-eval*"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/*warn-on-reflection*",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "var",
   :doc
   "When set to true, the compiler will emit warnings when reflection is\nneeded to resolve Java method calls or field accesses.\n\nDefaults to false.",
   :name "*warn-on-reflection*"}
  {:arglists ([] [x] [x y] [x y & more]),
   :name "+",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L809",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/+",
   :doc "Returns the sum of nums. (+) returns 0.",
   :var-type "function",
   :line 809,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "-",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L842",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/-",
   :doc
   "If no ys are supplied, returns the negation of x, else subtracts\nthe ys from x and returns the result.",
   :var-type "function",
   :line 842,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x form] [x form & more]),
   :name "->",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1284",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/->",
   :doc
   "Threads the expr through the forms. Inserts x as the\nsecond item in the first form, making a list of it if it is not a\nlist already. If there are more forms, inserts the first form as the\nsecond item in second form, etc.",
   :var-type "macro",
   :line 1284,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x form] [x form & more]),
   :name "->>",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1296",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/->>",
   :doc
   "Threads the expr through the forms. Inserts x as the\nlast item in the first form, making a list of it if it is not a\nlist already. If there are more forms, inserts the first form as the\nlast item in second form, etc.",
   :var-type "macro",
   :line 1296,
   :file "src/clj/clojure/core.clj"}
  {:forms
   [(.instanceMember instance args*)
    (.instanceMember Classname args*)
    (Classname/staticMethod args*)
    Classname/staticField],
   :name ".",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/.",
   :doc
   "The instance member form works for both fields and methods.\nThey all expand into calls to the dot operator at macroexpansion time.\n\nPlease see http://clojure.org/java_interop#dot",
   :var-type "special form",
   :file nil}
  {:arglists ([x form] [x form & more]),
   :name "..",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1266",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/..",
   :doc
   "form => fieldName-symbol or (instanceMethodName-symbol args*)\n\nExpands into a member access (.) of the first member on the first\nargument, followed by the next member on the result, etc. For\ninstance:\n\n(.. System (getProperties) (get \"os.name\"))\n\nexpands to:\n\n(. (. System (getProperties)) (get \"os.name\"))\n\nbut is easier to write, read, and understand.",
   :var-type "macro",
   :line 1266,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "/",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L831",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core//",
   :doc
   "If no denominators are supplied, returns 1/numerator,\nelse returns numerator divided by all of the denominators.",
   :var-type "function",
   :line 831,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "<",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L751",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/<",
   :doc
   "Returns non-nil if nums are in monotonically increasing order,\notherwise false.",
   :var-type "function",
   :line 751,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "<=",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L853",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/<=",
   :doc
   "Returns non-nil if nums are in monotonically non-decreasing order,\notherwise false.",
   :var-type "function",
   :line 853,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "=",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L653",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/=",
   :doc
   "Equality. Returns true if x equals y, false if not. Same as\nJava x.equals(y) except it also works for nil, and compares\nnumbers and collections in a type-independent manner.  Clojure's immutable data\nstructures define equals() (and thus =) as a value, not an identity,\ncomparison.",
   :var-type "function",
   :line 653,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "==",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L898",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/==",
   :doc
   "Returns non-nil if nums all have the same value, otherwise false",
   :var-type "function",
   :line 898,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name ">",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L868",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/>",
   :doc
   "Returns non-nil if nums are in monotonically decreasing order,\notherwise false.",
   :var-type "function",
   :line 868,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name ">=",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L883",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/>=",
   :doc
   "Returns non-nil if nums are in monotonically non-increasing order,\notherwise false.",
   :var-type "function",
   :line 883,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([s key]),
   :name "accessor",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3138",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/accessor",
   :doc
   "Returns a fn that, given an instance of a structmap with the basis,\nreturns the value at the key.  The key must be in the basis. The\nreturned function should be (slightly) more efficient than using\nget, but such use of accessors should be limited to known\nperformance-critical areas.",
   :var-type "function",
   :line 3138,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([array]),
   :name "aclone",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2980",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/aclone",
   :doc
   "Returns a clone of the Java array. Works on arrays of known\ntypes.",
   :var-type "function",
   :line 2980,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([url]),
   :name "add-classpath",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4066",
   :deprecated "1.1",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/add-classpath",
   :doc
   "DEPRECATED \n\nAdds the url (String or URL object) to the classpath per\nURLClassLoader.addURL",
   :var-type "function",
   :line 4066,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([reference key fn]),
   :name "add-watch",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1613",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/add-watch",
   :doc
   "Alpha - subject to change.\nAdds a watch function to an agent/atom/var/ref reference. The watch\nfn must be a fn of 4 args: a key, the reference, its old-state, its\nnew-state. Whenever the reference's state might have been changed,\nany registered watches will have their functions called. The watch fn\nwill be called synchronously, on the agent's thread if an agent,\nbefore any pending sends if agent or ref. Note that an atom's or\nref's state may have changed again prior to the fn call, so use\nold/new-state rather than derefing the reference. Note also that watch\nfns may be called from multiple threads simultaneously. Var watchers\nare triggered only by root binding changes, not thread-local\nset!s. Keys must be unique per reference, and can be used to remove\nthe watch with remove-watch, but are otherwise considered opaque by\nthe watch mechanism.",
   :var-type "function",
   :line 1613,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([state & options]),
   :name "agent",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1550",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/agent",
   :doc
   "Creates and returns an agent with an initial value of state and\nzero or more options (in any order):\n\n:meta metadata-map\n\n:validator validate-fn\n\n:error-handler handler-fn\n\n:error-mode mode-keyword\n\nIf metadata-map is supplied, it will be come the metadata on the\nagent. validate-fn must be nil or a side-effect-free fn of one\nargument, which will be passed the intended new state on any state\nchange. If the new state is unacceptable, the validate-fn should\nreturn false or throw an exception.  handler-fn is called if an\naction throws an exception or if validate-fn rejects a new state --\nsee set-error-handler! for details.  The mode-keyword may be either\n:continue (the default if an error-handler is given) or :fail (the\ndefault if no error-handler is given) -- see set-error-mode! for\ndetails.",
   :var-type "function",
   :line 1550,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([a]),
   :name "agent-error",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1638",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/agent-error",
   :doc
   "Returns the exception thrown during an asynchronous action of the\nagent if the agent is failed.  Returns nil if the agent is not\nfailed.",
   :var-type "function",
   :line 1638,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([a]),
   :name "agent-errors",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1698",
   :deprecated "1.2",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/agent-errors",
   :doc
   "DEPRECATED: Use 'agent-error' instead.\nReturns a sequence of the exceptions thrown during asynchronous\nactions of the agent.",
   :var-type "function",
   :line 1698,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([array idx] [array idx & idxs]),
   :name "aget",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2987",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/aget",
   :doc
   "Returns the value at the index/indices. Works on Java arrays of all\ntypes.",
   :var-type "function",
   :line 2987,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([array]),
   :name "alength",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2973",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/alength",
   :doc
   "Returns the length of the Java array. Works on arrays of all\ntypes.",
   :var-type "function",
   :line 2973,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([alias namespace-sym]),
   :name "alias",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3299",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/alias",
   :doc
   "Add an alias in the current namespace to another\nnamespace. Arguments are two symbols: the alias to be used, and\nthe symbolic name of the target namespace. Use :as in the ns macro in preference\nto calling this directly.",
   :var-type "function",
   :line 3299,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([]),
   :name "all-ns",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3195",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/all-ns",
   :doc "Returns a sequence of all namespaces.",
   :var-type "function",
   :line 3195,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ref fun & args]),
   :name "alter",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1857",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/alter",
   :doc
   "Must be called in a transaction. Sets the in-transaction-value of\nref to:\n\n(apply fun in-transaction-value-of-ref args)\n\nand returns the in-transaction-value of ref.",
   :var-type "function",
   :line 1857,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([iref f & args]),
   :name "alter-meta!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1823",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/alter-meta!",
   :doc
   "Atomically sets the metadata for a namespace/var/ref/agent/atom to be:\n\n(apply f its-current-meta args)\n\nf must be free of side-effects",
   :var-type "function",
   :line 1823,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([v f & args]),
   :name "alter-var-root",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4347",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/alter-var-root",
   :doc
   "Atomically alters the root binding of var v by applying f to its\ncurrent value plus any args",
   :var-type "function",
   :line 4347,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([a idx ret expr]),
   :name "amap",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4108",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/amap",
   :doc
   "Maps an expression across an array a, using an index named idx, and\nreturn value named ret, initialized to a clone of a, then setting \neach element of ret to the evaluation of expr, returning the new \narray ret.",
   :var-type "macro",
   :line 4108,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([tag] [h tag]),
   :name "ancestors",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4434",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ancestors",
   :doc
   "Returns the immediate and indirect parents of tag, either via a Java type\ninheritance relationship or a relationship established via derive. h\nmust be a hierarchy obtained from make-hierarchy, if not supplied\ndefaults to the global hierarchy",
   :var-type "function",
   :line 4434,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([] [x] [x & next]),
   :name "and",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L693",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/and",
   :doc
   "Evaluates exprs one at a time, from left to right. If a form\nreturns logical false (nil or false), and returns that value and\ndoesn't evaluate any of the other expressions, otherwise it returns\nthe value of the last expr. (and) returns true.",
   :var-type "macro",
   :line 693,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f args* argseq]),
   :name "apply",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L535",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/apply",
   :doc
   "Applies fn f to the argument list formed by prepending args to argseq.",
   :var-type "function",
   :line 535,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([a idx ret init expr]),
   :name "areduce",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4124",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/areduce",
   :doc
   "Reduces an expression across an array a, using an index named idx,\nand return value named ret, initialized to init, setting ret to the \nevaluation of expr at each step, returning ret.",
   :var-type "macro",
   :line 4124,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([] [& keyvals]),
   :name "array-map",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3387",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/array-map",
   :doc "Constructs an array-map.",
   :var-type "function",
   :line 3387,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([array idx val] [array idx idx2 & idxv]),
   :name "aset",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2998",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/aset",
   :doc
   "Sets the value at the index/indices. Works on Java arrays of\nreference types. Returns val.",
   :var-type "function",
   :line 2998,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([array idx val] [array idx idx2 & idxv]),
   :name "aset-boolean",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3031",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/aset-boolean",
   :doc
   "Sets the value at the index/indices. Works on arrays of boolean. Returns val.",
   :var-type "function",
   :line 3031,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([array idx val] [array idx idx2 & idxv]),
   :name "aset-byte",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3051",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/aset-byte",
   :doc
   "Sets the value at the index/indices. Works on arrays of byte. Returns val.",
   :var-type "function",
   :line 3051,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([array idx val] [array idx idx2 & idxv]),
   :name "aset-char",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3056",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/aset-char",
   :doc
   "Sets the value at the index/indices. Works on arrays of char. Returns val.",
   :var-type "function",
   :line 3056,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([array idx val] [array idx idx2 & idxv]),
   :name "aset-double",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3041",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/aset-double",
   :doc
   "Sets the value at the index/indices. Works on arrays of double. Returns val.",
   :var-type "function",
   :line 3041,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([array idx val] [array idx idx2 & idxv]),
   :name "aset-float",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3036",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/aset-float",
   :doc
   "Sets the value at the index/indices. Works on arrays of float. Returns val.",
   :var-type "function",
   :line 3036,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([array idx val] [array idx idx2 & idxv]),
   :name "aset-int",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3021",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/aset-int",
   :doc
   "Sets the value at the index/indices. Works on arrays of int. Returns val.",
   :var-type "function",
   :line 3021,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([array idx val] [array idx idx2 & idxv]),
   :name "aset-long",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3026",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/aset-long",
   :doc
   "Sets the value at the index/indices. Works on arrays of long. Returns val.",
   :var-type "function",
   :line 3026,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([array idx val] [array idx idx2 & idxv]),
   :name "aset-short",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3046",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/aset-short",
   :doc
   "Sets the value at the index/indices. Works on arrays of short. Returns val.",
   :var-type "function",
   :line 3046,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "assert",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3726",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/assert",
   :doc
   "Evaluates expr and throws an exception if it does not evaluate to\nlogical true.",
   :var-type "macro",
   :line 3726,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([map key val] [map key val & kvs]),
   :name "assoc",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L161",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/assoc",
   :doc
   "assoc[iate]. When applied to a map, returns a new map of the\nsame (hashed/sorted) type, that contains the mapping of key(s) to\nval(s). When applied to a vector, returns a new vector that\ncontains val at index. Note - index must be <= (count vector).",
   :var-type "function",
   :line 161,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll key val] [coll key val & kvs]),
   :name "assoc!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2561",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/assoc!",
   :doc
   "Alpha - subject to change.\nWhen applied to a transient map, adds mapping of key(s) to\nval(s). When applied to a transient vector, sets the val at index.\nNote - index must be <= (count vector). Returns coll.",
   :var-type "function",
   :line 2561,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([m [k & ks] v]),
   :name "assoc-in",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4949",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/assoc-in",
   :doc
   "Associates a value in a nested associative structure, where ks is a\nsequence of keys and v is the new value and returns a new nested structure.\nIf any levels do not exist, hash-maps will be created.",
   :var-type "function",
   :line 4949,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "associative?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5005",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/associative?",
   :doc "Returns true if coll implements Associative",
   :var-type "function",
   :line 5005,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x & options]),
   :name "atom",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1767",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/atom",
   :doc
   "Creates and returns an Atom with an initial value of x and zero or\nmore options (in any order):\n\n:meta metadata-map\n\n:validator validate-fn\n\nIf metadata-map is supplied, it will be come the metadata on the\natom. validate-fn must be nil or a side-effect-free fn of one\nargument, which will be passed the intended new state on any state\nchange. If the new state is unacceptable, the validate-fn should\nreturn false or throw an exception.",
   :var-type "function",
   :line 1767,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& agents]),
   :name "await",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2471",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/await",
   :doc
   "Blocks the current thread (indefinitely!) until all actions\ndispatched thus far, from this thread or agent, to the agent(s) have\noccurred.  Will block on failed agents.  Will never return if\na failed agent is restarted with :clear-actions true.",
   :var-type "function",
   :line 2471,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([timeout-ms & agents]),
   :name "await-for",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2492",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/await-for",
   :doc
   "Blocks the current thread until all actions dispatched thus\nfar (from this thread or agent) to the agents have occurred, or the\ntimeout (in milliseconds) has elapsed. Returns nil if returning due\nto timeout, non-nil otherwise.",
   :var-type "function",
   :line 2492,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([c]),
   :name "bases",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4380",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bases",
   :doc
   "Returns the immediate superclass and direct interfaces of c, if any",
   :var-type "function",
   :line 4380,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "bean",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj#L369",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bean",
   :doc
   "Takes a Java object and returns a read-only implementation of the\nmap abstraction based upon its JavaBean properties.",
   :var-type "function",
   :line 369,
   :file "src/clj/clojure/core_proxy.clj"}
  {:arglists ([x]),
   :name "bigdec",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2790",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bigdec",
   :doc "Coerce to BigDecimal",
   :var-type "function",
   :line 2790,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "bigint",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2779",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bigint",
   :doc "Coerce to BigInteger",
   :var-type "function",
   :line 2779,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([bindings & body]),
   :name "binding",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1468",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/binding",
   :doc
   "binding => var-symbol init-expr\n\nCreates new bindings for the (already-existing) vars, with the\nsupplied initial values, executes the exprs in an implicit do, then\nre-establishes the bindings that existed before.  The new bindings\nare made in parallel (unlike let); all init-exprs are evaluated\nbefore the vars are bound to their new values.",
   :var-type "macro",
   :line 1468,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x y]),
   :name "bit-and",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1031",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bit-and",
   :doc "Bitwise and",
   :var-type "function",
   :line 1031,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x y]),
   :name "bit-and-not",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1049",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bit-and-not",
   :doc "Bitwise and with complement",
   :var-type "function",
   :line 1049,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x n]),
   :name "bit-clear",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1055",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bit-clear",
   :doc "Clear bit at index n",
   :var-type "function",
   :line 1055,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x n]),
   :name "bit-flip",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1065",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bit-flip",
   :doc "Flip bit at index n",
   :var-type "function",
   :line 1065,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "bit-not",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1024",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bit-not",
   :doc "Bitwise complement",
   :var-type "function",
   :line 1024,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x y]),
   :name "bit-or",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1037",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bit-or",
   :doc "Bitwise or",
   :var-type "function",
   :line 1037,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x n]),
   :name "bit-set",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1060",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bit-set",
   :doc "Set bit at index n",
   :var-type "function",
   :line 1060,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x n]),
   :name "bit-shift-left",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1076",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bit-shift-left",
   :doc "Bitwise shift left",
   :var-type "function",
   :line 1076,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x n]),
   :name "bit-shift-right",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1082",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bit-shift-right",
   :doc "Bitwise shift right",
   :var-type "function",
   :line 1082,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x n]),
   :name "bit-test",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1070",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bit-test",
   :doc "Test bit at index n",
   :var-type "function",
   :line 1070,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x y]),
   :name "bit-xor",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1043",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bit-xor",
   :doc "Bitwise exclusive or",
   :var-type "function",
   :line 1043,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "boolean",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2711",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/boolean",
   :doc "Coerce to boolean",
   :var-type "function",
   :line 2711,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([size-or-seq] [size init-val-or-seq]),
   :name "boolean-array",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4144",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/boolean-array",
   :doc "Creates an array of booleans",
   :var-type "function",
   :line 4144,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([xs]),
   :name "booleans",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4207",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/booleans",
   :doc "Casts to boolean[]",
   :var-type "function",
   :line 4207,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& fntail]),
   :name "bound-fn",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1525",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bound-fn",
   :doc
   "Returns a function defined by the given fntail, which will install the\nsame bindings in effect as in the thread at the time bound-fn was called.\nThis may be used to define a helper function which runs on a different\nthread, but needs the same bindings in place.",
   :var-type "macro",
   :line 1525,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f]),
   :name "bound-fn*",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1514",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bound-fn*",
   :doc
   "Returns a function, which will install the same bindings in effect as in\nthe thread at the time bound-fn* was called and then call f with any given\narguments. This may be used to define a helper function which runs on a\ndifferent thread, but needs the same bindings in place.",
   :var-type "function",
   :line 1514,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& vars]),
   :name "bound?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4353",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bound?",
   :doc
   "Returns true if all of the vars provided as arguments have any bound value, root or thread-local.\nImplies that deref'ing the provided vars will succeed. Returns true if no vars are provided.",
   :var-type "function",
   :line 4353,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "butlast",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L232",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/butlast",
   :doc
   "Return a seq of all but the last item in coll, in linear time",
   :var-type "function",
   :line 232,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "byte",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2697",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/byte",
   :doc "Coerce to byte",
   :var-type "function",
   :line 2697,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([size-or-seq] [size init-val-or-seq]),
   :name "byte-array",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4152",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/byte-array",
   :doc "Creates an array of bytes",
   :var-type "function",
   :line 4152,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([xs]),
   :name "bytes",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4212",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/bytes",
   :doc "Casts to bytes[]",
   :var-type "function",
   :line 4212,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([e & clauses]),
   :name "case",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5288",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/case",
   :doc
   "Takes an expression, and a set of clauses.\n\nEach clause can take the form of either:\n\ntest-constant result-expr\n\n(test-constant1 ... test-constantN)  result-expr\n\nThe test-constants are not evaluated. They must be compile-time\nliterals, and need not be quoted.  If the expression is equal to a\ntest-constant, the corresponding result-expr is returned. A single\ndefault expression can follow the clauses, and its value will be\nreturned if no clause matches. If no default expression is provided\nand no clause matches, an IllegalArgumentException is thrown.\n\nUnlike cond and condp, case does a constant-time dispatch, the\nclauses are not considered sequentially.  All manner of constant\nexpressions are acceptable in case, including numbers, strings,\nsymbols, keywords, and (Clojure) composites thereof. Note that since\nlists are used to group multiple constants that map to the same\nexpression, a vector can be used to match a list if needed. The\ntest-constants need not be all of the same type.",
   :var-type "macro",
   :line 5288,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([c x]),
   :name "cast",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L289",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/cast",
   :doc "Throws a ClassCastException if x is not a c, else returns x.",
   :var-type "function",
   :line 289,
   :file "src/clj/clojure/core.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/catch",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "special syntax",
   :doc
   "Syntax for use with try.\n\nPlease see http://clojure.org/special_forms#try",
   :name "catch"}
  {:arglists ([x]),
   :name "char",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2704",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/char",
   :doc "Coerce to char",
   :var-type "function",
   :line 2704,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([size-or-seq] [size init-val-or-seq]),
   :name "char-array",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4160",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/char-array",
   :doc "Creates an array of chars",
   :var-type "function",
   :line 4160,
   :file "src/clj/clojure/core.clj"}
  {:name "char-escape-string",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/core_print.clj#L162",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/core_print.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/char-escape-string",
   :doc "Returns escape string for char or nil if none",
   :var-type "var",
   :line 162,
   :file "src/clj/clojure/core_print.clj"}
  {:name "char-name-string",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/core_print.clj#L221",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/core_print.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/char-name-string",
   :doc "Returns name string for char or nil if none",
   :var-type "var",
   :line 221,
   :file "src/clj/clojure/core_print.clj"}
  {:arglists ([x]),
   :name "char?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L137",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/char?",
   :doc "Return true if x is a Character",
   :var-type "function",
   :line 137,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([xs]),
   :name "chars",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4217",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/chars",
   :doc "Casts to chars[]",
   :var-type "function",
   :line 4217,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "class",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2651",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/class",
   :doc "Returns the Class of x",
   :var-type "function",
   :line 2651,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "class?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4286",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/class?",
   :doc "Returns true if x is an instance of Class",
   :var-type "function",
   :line 4286,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([a]),
   :name "clear-agent-errors",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1708",
   :deprecated "1.2",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/clear-agent-errors",
   :doc
   "DEPRECATED: Use 'restart-agent' instead.\nClears any exceptions thrown during asynchronous actions of the\nagent, allowing subsequent actions to occur.",
   :var-type "function",
   :line 1708,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([]),
   :name "clojure-version",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5496",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/clojure-version",
   :doc "Returns clojure version as a printable string.",
   :var-type "function",
   :line 5496,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "coll?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4978",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/coll?",
   :doc "Returns true if x implements IPersistentCollection",
   :var-type "function",
   :line 4978,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& body]),
   :name "comment",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3669",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/comment",
   :doc "Ignores body, yields nil",
   :var-type "macro",
   :line 3669,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ref fun & args]),
   :name "commute",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1837",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/commute",
   :doc
   "Must be called in a transaction. Sets the in-transaction-value of\nref to:\n\n(apply fun in-transaction-value-of-ref args)\n\nand returns the in-transaction-value of ref.\n\nAt the commit point of the transaction, sets the value of ref to be:\n\n(apply fun most-recently-committed-value-of-ref args)\n\nThus fun should be commutative, or, failing that, you must accept\nlast-one-in-wins behavior.  commute allows for more concurrency than\nref-set.",
   :var-type "function",
   :line 1837,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f] [f g] [f g h] [f1 f2 f3 & fs]),
   :name "comp",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1936",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/comp",
   :doc
   "Takes a set of functions and returns a fn that is the composition\nof those fns.  The returned fn takes a variable number of args,\napplies the rightmost of fns to the args, the next\nfn (right-to-left) to the result, etc.",
   :var-type "function",
   :line 1936,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([pred]),
   :name "comparator",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2322",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/comparator",
   :doc
   "Returns an implementation of java.util.Comparator based upon pred.",
   :var-type "function",
   :line 2322,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x y]),
   :name "compare",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L682",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/compare",
   :doc
   "Comparator. Returns a negative number, zero, or a positive number\nwhen x is logically 'less than', 'equal to', or 'greater than'\ny. Same as Java x.compareTo(y) except it also works for nil, and\ncompares numbers and collections in a type-independent manner. x\nmust implement Comparable",
   :var-type "function",
   :line 682,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([atom oldval newval]),
   :name "compare-and-set!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1795",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/compare-and-set!",
   :doc
   "Atomically sets the value of atom to newval if and only if the\ncurrent value of the atom is identical to oldval. Returns true if\nset happened, else false",
   :var-type "function",
   :line 1795,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([lib]),
   :name "compile",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4917",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/compile",
   :doc
   "Compiles the namespace named by the symbol lib into a set of\nclassfiles. The source for the lib must be in a proper\nclasspath-relative directory. The output files will go into the\ndirectory specified by *compile-path*, and that directory too must\nbe in the classpath.",
   :var-type "function",
   :line 4917,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f]),
   :name "complement",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1101",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/complement",
   :doc
   "Takes a fn f and returns a fn that takes the same arguments as f,\nhas the same effects, if any, and returns the opposite truth value.",
   :var-type "function",
   :line 1101,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([] [x] [x y] [x y & zs]),
   :name "concat",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L592",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/concat",
   :doc
   "Returns a lazy seq representing the concatenation of the elements in the supplied colls.",
   :var-type "function",
   :line 592,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& clauses]),
   :name "cond",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L491",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/cond",
   :doc
   "Takes a set of test/expr pairs. It evaluates each test one at a\ntime.  If a test returns logical true, cond evaluates and returns\nthe value of the corresponding expr and doesn't evaluate any of the\nother tests or exprs. (cond) returns nil.",
   :var-type "macro",
   :line 491,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([pred expr & clauses]),
   :name "condp",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5107",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/condp",
   :doc
   "Takes a binary predicate, an expression, and a set of clauses.\nEach clause can take the form of either:\n\ntest-expr result-expr\n\ntest-expr :>> result-fn\n\nNote :>> is an ordinary keyword.\n\nFor each clause, (pred test-expr expr) is evaluated. If it returns\nlogical true, the clause is a match. If a binary clause matches, the\nresult-expr is returned, if a ternary clause matches, its result-fn,\nwhich must be a unary function, is called with the result of the\npredicate as its argument, the result of that call being the return\nvalue of condp. A single default expression can follow the clauses,\nand its value will be returned if no clause matches. If no default\nexpression is provided and no clause matches, an\nIllegalArgumentException is thrown.",
   :var-type "macro",
   :line 5107,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll x] [coll x & xs]),
   :name "conj",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L71",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/conj",
   :doc
   "conj[oin]. Returns a new collection with the xs\n'added'. (conj nil item) returns (item).  The 'addition' may\nhappen at different 'places' depending on the concrete type.",
   :var-type "function",
   :line 71,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll x]),
   :name "conj!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2553",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/conj!",
   :doc
   "Alpha - subject to change.\nAdds x to the transient collection, and return coll. The 'addition'\nmay happen at different 'places' depending on the concrete type.",
   :var-type "function",
   :line 2553,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x seq]),
   :name "cons",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L22",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/cons",
   :doc
   "Returns a new seq where x is the first element and seq is\nthe rest.",
   :var-type "function",
   :line 22,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "constantly",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1112",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/constantly",
   :doc
   "Returns a function that takes any number of arguments and returns x.",
   :var-type "function",
   :line 1112,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([c & ctor-args]),
   :name "construct-proxy",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj#L264",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/construct-proxy",
   :doc
   "Takes a proxy class and any arguments for its superclass ctor and\ncreates and returns an instance of the proxy.",
   :var-type "function",
   :line 264,
   :file "src/clj/clojure/core_proxy.clj"}
  {:arglists ([coll key]),
   :name "contains?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1145",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/contains?",
   :doc
   "Returns true if key is present in the given collection, otherwise\nreturns false.  Note that for numerically indexed collections like\nvectors and Java arrays, this tests if the numeric key is within the\nrange of indexes. 'contains?' operates constant or logarithmic time;\nit will not perform a linear search for a value.  See also 'some'.",
   :var-type "function",
   :line 1145,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "count",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L725",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/count",
   :doc
   "Returns the number of items in the collection. (count nil) returns\n0.  Also works on strings, arrays, and Java Collections and Maps",
   :var-type "function",
   :line 725,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "counted?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5020",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/counted?",
   :doc "Returns true if coll implements count in constant time",
   :var-type "function",
   :line 5020,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([sym]),
   :name "create-ns",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3182",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/create-ns",
   :doc
   "Create a new namespace named by the symbol if one doesn't already\nexist, returns it or the already-existing namespace of the same\nname.",
   :var-type "function",
   :line 3182,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& keys]),
   :name "create-struct",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3109",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/create-struct",
   :doc "Returns a structure basis object.",
   :var-type "function",
   :line 3109,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "cycle",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2211",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/cycle",
   :doc
   "Returns a lazy (infinite!) sequence of repetitions of the items in coll.",
   :var-type "function",
   :line 2211,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "dec",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L928",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/dec",
   :doc "Returns a number one less than num.",
   :var-type "function",
   :line 928,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n]),
   :name "decimal?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2762",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/decimal?",
   :doc "Returns true if n is a BigDecimal",
   :var-type "function",
   :line 2762,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& names]),
   :name "declare",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2309",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/declare",
   :doc
   "defs the supplied var names with no bindings, useful for making forward declarations.",
   :var-type "macro",
   :line 2309,
   :file "src/clj/clojure/core.clj"}
  {:forms [(def symbol doc-string? init?)],
   :name "def",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/def",
   :doc
   "Creates and interns a global var with the name\nof symbol in the current namespace (*ns*) or locates such a var if\nit already exists.  If init is supplied, it is evaluated, and the\nroot binding of the var is set to the resulting value.  If init is\nnot supplied, the root binding of the var is unaffected.\n\nPlease see http://clojure.org/special_forms#def",
   :var-type "special form",
   :file nil}
  {:arglists ([name & decl]),
   :name "definline",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4089",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/definline",
   :doc
   "Experimental - like defmacro, except defines a named function whose\nbody is the expansion, calls to which may be expanded inline as if\nit were a macro. Cannot be used with variadic (&) args.",
   :var-type "macro",
   :line 4089,
   :file "src/clj/clojure/core.clj"}
  {:arglists
   ([name doc-string? attr-map? [params*] body]
    [name doc-string? attr-map? ([params*] body) + attr-map?]),
   :name "defmacro",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L370",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/defmacro",
   :doc
   "Like defn, but the resulting function name is declared as a\nmacro and will be used as a macro by the compiler when it is\ncalled.",
   :var-type "macro",
   :line 370,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([multifn dispatch-val & fn-tail]),
   :name "defmethod",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1352",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/defmethod",
   :doc
   "Creates and installs a new method of multimethod associated with dispatch-value. ",
   :var-type "macro",
   :line 1352,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([name docstring? attr-map? dispatch-fn & options]),
   :name "defmulti",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1310",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/defmulti",
   :doc
   "Creates a new multimethod with the associated dispatch function.\nThe docstring and attribute-map are optional.\n\nOptions are key-value pairs and may be one of:\n  :default    the default dispatch value, defaults to :default\n  :hierarchy  the isa? hierarchy to use for dispatching\n              defaults to the global hierarchy",
   :var-type "macro",
   :line 1310,
   :file "src/clj/clojure/core.clj"}
  {:arglists
   ([name doc-string? attr-map? [params*] body]
    [name doc-string? attr-map? ([params*] body) + attr-map?]),
   :name "defn",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L242",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/defn",
   :doc
   "Same as (def name (fn [params* ] exprs*)) or (def\nname (fn ([params* ] exprs*)+)) with any doc-string or attrs added\nto the var metadata",
   :var-type "macro",
   :line 242,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([name & decls]),
   :name "defn-",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3823",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/defn-",
   :doc "same as defn, yielding non-public def",
   :var-type "macro",
   :line 3823,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([name expr]),
   :name "defonce",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4653",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/defonce",
   :doc
   "defs name to have the root value of the expr iff the named var has no root value,\nelse expr is unevaluated",
   :var-type "macro",
   :line 4653,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([name & opts+sigs]),
   :name "defprotocol",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj#L576",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/defprotocol",
   :doc
   "A protocol is a named set of named methods and their signatures:\n(defprotocol AProtocolName\n\n  ;optional doc string\n  \"A doc string for AProtocol abstraction\"\n\n;method signatures\n  (bar [this a b] \"bar docs\")\n  (baz [this a] [this a b] [this a b c] \"baz docs\"))\n\nNo implementations are provided. Docs can be specified for the\nprotocol overall and for each method. The above yields a set of\npolymorphic functions and a protocol object. All are\nnamespace-qualified by the ns enclosing the definition The resulting\nfunctions dispatch on the type of their first argument, which is\nrequired and corresponds to the implicit target object ('this' in \nJava parlance). defprotocol is dynamic, has no special compile-time \neffect, and defines no new types or classes. Implementations of \nthe protocol methods can be provided using extend.\n\ndefprotocol will automatically generate a corresponding interface,\nwith the same name as the protocol, i.e. given a protocol:\nmy.ns/Protocol, an interface: my.ns.Protocol. The interface will\nhave methods corresponding to the protocol functions, and the\nprotocol will automatically work with instances of the interface.\n\nNote that you should not use this interface with deftype or\nreify, as they support the protocol directly:\n\n(defprotocol P \n  (foo [this]) \n  (bar-me [this] [this y]))\n\n(deftype Foo [a b c] \n P\n  (foo [this] a)\n  (bar-me [this] b)\n  (bar-me [this y] (+ c y)))\n\n(bar-me (Foo. 1 2 3) 42)\n=> 45\n\n(foo \n  (let [x 42]\n    (reify P \n      (foo [this] 17)\n      (bar-me [this] x)\n      (bar-me [this y] x))))\n=> 17",
   :var-type "macro",
   :line 576,
   :file "src/clj/clojure/core_deftype.clj"}
  {:arglists ([name [& fields] & opts+specs]),
   :name "defrecord",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj#L230",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/defrecord",
   :doc
   "Alpha - subject to change\n\n(defrecord name [fields*]  options* specs*)\n\nCurrently there are no options.\n\nEach spec consists of a protocol or interface name followed by zero\nor more method bodies:\n\nprotocol-or-interface-or-Object\n(methodName [args*] body)*\n\nDynamically generates compiled bytecode for class with the given\nname, in a package with the same name as the current namespace, the\ngiven fields, and, optionally, methods for protocols and/or\ninterfaces.\n\nThe class will have the (immutable) fields named by\nfields, which can have type hints. Protocols/interfaces and methods\nare optional. The only methods that can be supplied are those\ndeclared in the protocols/interfaces.  Note that method bodies are\nnot closures, the local environment includes only the named fields,\nand those fields can be accessed directy.\n\nMethod definitions take the form:\n\n(methodname [args*] body)\n\nThe argument and return types can be hinted on the arg and\nmethodname symbols. If not supplied, they will be inferred, so type\nhints should be reserved for disambiguation.\n\nMethods should be supplied for all methods of the desired\nprotocol(s) and interface(s). You can also define overrides for\nmethods of Object. Note that a parameter must be supplied to\ncorrespond to the target object ('this' in Java parlance). Thus\nmethods for interfaces will take one more argument than do the\ninterface declarations. Note also that recur calls to the method\nhead should *not* pass the target object, it will be supplied\nautomatically and can not be substituted.\n\nIn the method bodies, the (unqualified) name can be used to name the\nclass (for calls to new, instance? etc).\n\nThe class will have implementations of several (clojure.lang)\ninterfaces generated automatically: IObj (metadata support) and\nIPersistentMap, and all of their superinterfaces.\n\nIn addition, defrecord will define type-and-value-based equality and\nhashCode.\n\nWhen AOT compiling, generates compiled bytecode for a class with the\ngiven name (a symbol), prepends the current ns as the package, and\nwrites the .class file to the *compile-path* directory.\n\nTwo constructors will be defined, one taking the designated fields\nfollowed by a metadata map (nil for none) and an extension field\nmap (nil for none), and one taking only the fields (using nil for\nmeta and extension fields).",
   :var-type "macro",
   :line 230,
   :file "src/clj/clojure/core_deftype.clj"}
  {:arglists ([name & keys]),
   :name "defstruct",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3115",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/defstruct",
   :doc "Same as (def name (create-struct keys...))",
   :var-type "macro",
   :line 3115,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([name [& fields] & opts+specs]),
   :name "deftype",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj#L324",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/deftype",
   :doc
   "Alpha - subject to change\n\n(deftype name [fields*]  options* specs*)\n\nCurrently there are no options.\n\nEach spec consists of a protocol or interface name followed by zero\nor more method bodies:\n\nprotocol-or-interface-or-Object\n(methodName [args*] body)*\n\nDynamically generates compiled bytecode for class with the given\nname, in a package with the same name as the current namespace, the\ngiven fields, and, optionally, methods for protocols and/or\ninterfaces. \n\nThe class will have the (by default, immutable) fields named by\nfields, which can have type hints. Protocols/interfaces and methods\nare optional. The only methods that can be supplied are those\ndeclared in the protocols/interfaces.  Note that method bodies are\nnot closures, the local environment includes only the named fields,\nand those fields can be accessed directy. Fields can be qualified\nwith the metadata :volatile-mutable true or :unsynchronized-mutable\ntrue, at which point (set! afield aval) will be supported in method\nbodies. Note well that mutable fields are extremely difficult to use\ncorrectly, and are present only to facilitate the building of higher\nlevel constructs, such as Clojure's reference types, in Clojure\nitself. They are for experts only - if the semantics and\nimplications of :volatile-mutable or :unsynchronized-mutable are not\nimmediately apparent to you, you should not be using them.\n\nMethod definitions take the form:\n\n(methodname [args*] body)\n\nThe argument and return types can be hinted on the arg and\nmethodname symbols. If not supplied, they will be inferred, so type\nhints should be reserved for disambiguation.\n\nMethods should be supplied for all methods of the desired\nprotocol(s) and interface(s). You can also define overrides for\nmethods of Object. Note that a parameter must be supplied to\ncorrespond to the target object ('this' in Java parlance). Thus\nmethods for interfaces will take one more argument than do the\ninterface declarations. Note also that recur calls to the method\nhead should *not* pass the target object, it will be supplied\nautomatically and can not be substituted.\n\nIn the method bodies, the (unqualified) name can be used to name the\nclass (for calls to new, instance? etc).\n\nWhen AOT compiling, generates compiled bytecode for a class with the\ngiven name (a symbol), prepends the current ns as the package, and\nwrites the .class file to the *compile-path* directory.\n\nOne constructors will be defined, taking the designated fields.",
   :var-type "macro",
   :line 324,
   :file "src/clj/clojure/core_deftype.clj"}
  {:arglists ([& body]),
   :name "delay",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L619",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/delay",
   :doc
   "Takes a body of expressions and yields a Delay object that will\ninvoke the body only the first time it is forced (with force or deref/@), and\nwill cache the result and return it on all subsequent force\ncalls.",
   :var-type "macro",
   :line 619,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "delay?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L628",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/delay?",
   :doc "returns true if x is a Delay created with delay",
   :var-type "function",
   :line 628,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([promise val]),
   :name "deliver",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5533",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/deliver",
   :doc
   "Alpha - subject to change.\nDelivers the supplied value to the promise, releasing any pending\nderefs. A subsequent call to deliver on a promise will throw an exception.",
   :var-type "function",
   :line 5533,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([r]),
   :name "denominator",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2755",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/denominator",
   :doc "Returns the denominator part of a Ratio.",
   :var-type "function",
   :line 2755,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ref]),
   :name "deref",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1757",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/deref",
   :doc
   "Also reader macro: @ref/@agent/@var/@atom/@delay/@future. Within a transaction,\nreturns the in-transaction-value of ref, else returns the\nmost-recently-committed value of ref. When applied to a var, agent\nor atom, returns its current state. When applied to a delay, forces\nit if not already forced. When applied to a future, will block if\ncomputation not complete",
   :var-type "function",
   :line 1757,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([tag parent] [h tag parent]),
   :name "derive",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4462",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/derive",
   :doc
   "Establishes a parent/child relationship between parent and\ntag. Parent must be a namespace-qualified symbol or keyword and\nchild can be either a namespace-qualified symbol or keyword or a\nclass. h must be a hierarchy obtained from make-hierarchy, if not\nsupplied defaults to, and modifies, the global hierarchy.",
   :var-type "function",
   :line 4462,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([tag] [h tag]),
   :name "descendants",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4450",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/descendants",
   :doc
   "Returns the immediate and indirect children of tag, through a\nrelationship established via derive. h must be a hierarchy obtained\nfrom make-hierarchy, if not supplied defaults to the global\nhierarchy. Note: does not work on Java type inheritance\nrelationships.",
   :var-type "function",
   :line 4450,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([set] [set key] [set key & ks]),
   :name "disj",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1177",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/disj",
   :doc
   "disj[oin]. Returns a new set of the same (hashed/sorted) type, that\ndoes not contain key(s).",
   :var-type "function",
   :line 1177,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([set] [set key] [set key & ks]),
   :name "disj!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2593",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/disj!",
   :doc
   "Alpha - subject to change.\ndisj[oin]. Returns a transient set of the same (hashed/sorted) type, that\ndoes not contain key(s).",
   :var-type "function",
   :line 2593,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([map] [map key] [map key & ks]),
   :name "dissoc",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1164",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/dissoc",
   :doc
   "dissoc[iate]. Returns a new map of the same (hashed/sorted) type,\nthat does not contain a mapping for key(s).",
   :var-type "function",
   :line 1164,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([map key] [map key & ks]),
   :name "dissoc!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2574",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/dissoc!",
   :doc
   "Alpha - subject to change.\nReturns a transient map that doesn't contain a mapping for key(s).",
   :var-type "function",
   :line 2574,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "distinct",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3963",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/distinct",
   :doc
   "Returns a lazy sequence of the elements of coll with duplicates removed",
   :var-type "function",
   :line 3963,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "distinct?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4521",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/distinct?",
   :doc "Returns true if no two of the arguments are =",
   :var-type "function",
   :line 4521,
   :file "src/clj/clojure/core.clj"}
  {:forms [(do exprs*)],
   :name "do",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/do",
   :doc
   "Evaluates the expressions in order and returns the value of\nthe last. If no expressions are supplied, returns nil.\n\nPlease see http://clojure.org/special_forms#do",
   :var-type "special form",
   :file nil}
  {:arglists ([coll] [n coll]),
   :name "doall",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2456",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/doall",
   :doc
   "When lazy sequences are produced via functions that have side\neffects, any effects other than those needed to produce the first\nelement in the seq do not occur until the seq is consumed. doall can\nbe used to force any effects. Walks through the successive nexts of\nthe seq, retains the head and returns it, thus causing the entire\nseq to reside in memory at one time.",
   :var-type "function",
   :line 2456,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([name]),
   :name "doc",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3880",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/doc",
   :doc
   "Prints documentation for a var or special form given its name",
   :var-type "macro",
   :line 3880,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll] [n coll]),
   :name "dorun",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2442",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/dorun",
   :doc
   "When lazy sequences are produced via functions that have side\neffects, any effects other than those needed to produce the first\nelement in the seq do not occur until the seq is consumed. dorun can\nbe used to force any effects. Walks through the successive nexts of\nthe seq, does not retain the head and returns nil.",
   :var-type "function",
   :line 2442,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([seq-exprs & body]),
   :name "doseq",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2384",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/doseq",
   :doc
   "Repeatedly executes body (presumably for side-effects) with\nbindings and filtering as provided by \"for\".  Does not retain\nthe head of the sequence. Returns nil.",
   :var-type "macro",
   :line 2384,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& exprs]),
   :name "dosync",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3993",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/dosync",
   :doc
   "Runs the exprs (in an implicit do) in a transaction that encompasses\nexprs and any nested calls.  Starts a transaction if none is already\nrunning on this thread. Any uncaught exception will abort the\ntransaction and flow out of dosync. The exprs may be run more than\nonce, but any effects on Refs will be atomic.",
   :var-type "macro",
   :line 3993,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([bindings & body]),
   :name "dotimes",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2508",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/dotimes",
   :doc
   "bindings => name n\n\nRepeatedly executes body (presumably for side-effects) with name\nbound to integers from 0 through n-1.",
   :var-type "macro",
   :line 2508,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x & forms]),
   :name "doto",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2932",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/doto",
   :doc
   "Evaluates x then calls all of the methods and functions with the\nvalue of x supplied at the front of the given arguments.  The forms\nare evaluated in order.  Returns x.\n\n(doto (new java.util.HashMap) (.put \"a\" 1) (.put \"b\" 2))",
   :var-type "macro",
   :line 2932,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "double",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2683",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/double",
   :doc "Coerce to double",
   :var-type "function",
   :line 2683,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([size-or-seq] [size init-val-or-seq]),
   :name "double-array",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4176",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/double-array",
   :doc "Creates an array of doubles",
   :var-type "function",
   :line 4176,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([xs]),
   :name "doubles",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4237",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/doubles",
   :doc "Casts to double[]",
   :var-type "function",
   :line 4237,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n coll]),
   :name "drop",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2172",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/drop",
   :doc
   "Returns a lazy sequence of all but the first n items in coll.",
   :var-type "function",
   :line 2172,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([s] [n s]),
   :name "drop-last",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2183",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/drop-last",
   :doc
   "Return a lazy sequence of all but the last n (default 1) items in coll",
   :var-type "function",
   :line 2183,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([pred coll]),
   :name "drop-while",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2199",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/drop-while",
   :doc
   "Returns a lazy sequence of the items in coll starting from the first\nitem for which (pred item) returns nil.",
   :var-type "function",
   :line 2199,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "empty",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4101",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/empty",
   :doc
   "Returns an empty collection of the same category as coll, or nil",
   :var-type "function",
   :line 4101,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "empty?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4972",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/empty?",
   :doc
   "Returns true if coll has no items - same as (not (seq coll)).\nPlease use the idiom (seq x) rather than (not (empty? x))",
   :var-type "function",
   :line 4972,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ref]),
   :name "ensure",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1897",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ensure",
   :doc
   "Must be called in a transaction. Protects the ref from modification\nby other transactions.  Returns the in-transaction-value of\nref. Allows for more concurrency than (ref-set ref @ref)",
   :var-type "function",
   :line 1897,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([e]),
   :name "enumeration-seq",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4563",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/enumeration-seq",
   :doc "Returns a seq on a java.util.Enumeration",
   :var-type "function",
   :line 4563,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([a]),
   :name "error-handler",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1669",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/error-handler",
   :doc
   "Returns the error-handler of agent a, or nil if there is none.\nSee set-error-handler!",
   :var-type "function",
   :line 1669,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([a]),
   :name "error-mode",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1692",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/error-mode",
   :doc "Returns the error-mode of agent a.  See set-error-mode!",
   :var-type "function",
   :line 1692,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([form]),
   :name "eval",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2379",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/eval",
   :doc
   "Evaluates the form data structure (not text!) and returns the result.",
   :var-type "function",
   :line 2379,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n]),
   :name "even?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1088",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/even?",
   :doc
   "Returns true if n is even, throws an exception if n is not an integer",
   :var-type "function",
   :line 1088,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([pred coll]),
   :name "every?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2026",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/every?",
   :doc
   "Returns true if (pred x) is logical true for every x in coll, else\nfalse.",
   :var-type "function",
   :line 2026,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([atype & proto+mmaps]),
   :name "extend",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj#L630",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/extend",
   :doc
   "Implementations of protocol methods can be provided using the extend construct:\n\n (extend AType\n   AProtocol\n    {:foo an-existing-fn\n     :bar (fn [a b] ...)\n     :baz (fn ([a]...) ([a b] ...)...)}\n   BProtocol \n     {...} \n   ...)\n\n extend takes a type/class (or interface, see below), and one or more\n protocol + method map pairs. It will extend the polymorphism of the\n protocol's methods to call the supplied methods when an AType is\n provided as the first argument. \n\n Method maps are maps of the keyword-ized method names to ordinary\n fns. This facilitates easy reuse of existing fns and fn maps, for\n code reuse/mixins without derivation or composition. You can extend\n an interface to a protocol. This is primarily to facilitate interop\n with the host (e.g. Java) but opens the door to incidental multiple\n inheritance of implementation since a class can inherit from more\n than one interface, both of which extend the protocol. It is TBD how\n to specify which impl to use. You can extend a protocol on nil.\n\n If you are supplying the definitions explicitly (i.e. not reusing\n exsting functions or mixin maps), you may find it more convenient to\n use the extend-type or extend-protocol macros.\n\n Note that multiple independent extend clauses can exist for the same\n type, not all protocols need be defined in a single extend call.\n\n See also:\n extends?, satisfies?, extenders",
   :var-type "function",
   :line 630,
   :file "src/clj/clojure/core_deftype.clj"}
  {:arglists ([p & specs]),
   :name "extend-protocol",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj#L730",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/extend-protocol",
   :doc
   "Useful when you want to provide several implementations of the same\nprotocol all at once. Takes a single protocol and the implementation\nof that protocol for one or more types. Expands into calls to\nextend-type:\n\n(extend-protocol Protocol\n  AType\n    (foo [x] ...)\n    (bar [x y] ...)\n  BType\n    (foo [x] ...)\n    (bar [x y] ...)\n  AClass\n    (foo [x] ...)\n    (bar [x y] ...)\n  nil\n    (foo [x] ...)\n    (bar [x y] ...))\n\nexpands into:\n\n(do\n (clojure.core/extend-type AType Protocol \n   (foo [x] ...) \n   (bar [x y] ...))\n (clojure.core/extend-type BType Protocol \n   (foo [x] ...) \n   (bar [x y] ...))\n (clojure.core/extend-type AClass Protocol \n   (foo [x] ...) \n   (bar [x y] ...))\n (clojure.core/extend-type nil Protocol \n   (foo [x] ...) \n   (bar [x y] ...)))",
   :var-type "macro",
   :line 730,
   :file "src/clj/clojure/core_deftype.clj"}
  {:arglists ([t & specs]),
   :name "extend-type",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj#L698",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/extend-type",
   :doc
   "A macro that expands into an extend call. Useful when you are\nsupplying the definitions explicitly inline, extend-type\nautomatically creates the maps required by extend.  Propagates the\nclass as a type hint on the first argument of all fns.\n\n(extend-type MyType \n  Countable\n    (cnt [c] ...)\n  Foo\n    (bar [x y] ...)\n    (baz ([x] ...) ([x y & zs] ...)))\n\nexpands into:\n\n(extend MyType\n Countable\n   {:cnt (fn [c] ...)}\n Foo\n   {:baz (fn ([x] ...) ([x y & zs] ...))\n    :bar (fn [x y] ...)})",
   :var-type "macro",
   :line 698,
   :file "src/clj/clojure/core_deftype.clj"}
  {:arglists ([protocol]),
   :name "extenders",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj#L451",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/extenders",
   :doc
   "Returns a collection of the types explicitly extending protocol",
   :var-type "function",
   :line 451,
   :file "src/clj/clojure/core_deftype.clj"}
  {:arglists ([protocol atype]),
   :name "extends?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj#L444",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/extends?",
   :doc "Returns true if atype extends protocol",
   :var-type "function",
   :line 444,
   :file "src/clj/clojure/core_deftype.clj"}
  {:arglists ([x]),
   :name "false?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L431",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/false?",
   :doc "Returns true if x is the value false, false otherwise.",
   :var-type "function",
   :line 431,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "ffirst",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L90",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ffirst",
   :doc "Same as (first (first x))",
   :var-type "function",
   :line 90,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([dir]),
   :name "file-seq",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3911",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/file-seq",
   :doc "A tree seq on java.io.Files",
   :var-type "function",
   :line 3911,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([pred coll]),
   :name "filter",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2124",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/filter",
   :doc
   "Returns a lazy sequence of the items in coll for which\n(pred item) returns true. pred must be free of side-effects.",
   :var-type "function",
   :line 2124,
   :file "src/clj/clojure/core.clj"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/finally",
   :namespace "clojure.core",
   :added "1.0",
   :var-type "special syntax",
   :doc
   "Syntax for use with try.\n\nPlease see http://clojure.org/special_forms#try",
   :name "finally"}
  {:arglists ([map key]),
   :name "find",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1192",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/find",
   :doc "Returns the map entry for key, or nil if key not present.",
   :var-type "function",
   :line 1192,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([re-string-or-pattern]),
   :name "find-doc",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3837",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/find-doc",
   :doc
   "Prints documentation for any var whose documentation or name\ncontains a match for re-string-or-pattern",
   :var-type "function",
   :line 3837,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([sym]),
   :name "find-ns",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3177",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/find-ns",
   :doc
   "Returns the namespace named by the symbol or nil if it doesn't exist.",
   :var-type "function",
   :line 3177,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([sym]),
   :name "find-var",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1534",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/find-var",
   :doc
   "Returns the global var named by the namespace-qualified symbol, or\nnil if no var with that name.",
   :var-type "function",
   :line 1534,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "first",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L48",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/first",
   :doc
   "Returns the first item in the collection. Calls seq on its\nargument. If coll is nil, returns nil.",
   :var-type "function",
   :line 48,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "flatten",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5542",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/flatten",
   :doc
   "Takes any nested combination of sequential things (lists, vectors,\netc.) and returns their contents as a single, flat sequence.\n(flatten nil) returns nil.",
   :var-type "function",
   :line 5542,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "float",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2676",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/float",
   :doc "Coerce to float",
   :var-type "function",
   :line 2676,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([size-or-seq] [size init-val-or-seq]),
   :name "float-array",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4136",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/float-array",
   :doc "Creates an array of floats",
   :var-type "function",
   :line 4136,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n]),
   :name "float?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2767",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/float?",
   :doc "Returns true if n is a floating point number",
   :var-type "function",
   :line 2767,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([xs]),
   :name "floats",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4227",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/floats",
   :doc "Casts to float[]",
   :var-type "function",
   :line 4227,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([]),
   :name "flush",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2840",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/flush",
   :doc
   "Flushes the output stream that is the current value of\n*out*",
   :var-type "function",
   :line 2840,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& sigs]),
   :name "fn",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3491",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/fn",
   :doc
   "(fn name? [params* ] exprs*)\n(fn name? ([params* ] exprs*)+)\n\nparams => positional-params* , or positional-params* & next-param\npositional-param => binding-form\nnext-param => binding-form\nname => symbol\n\nDefines a function",
   :var-type "macro",
   :line 3491,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "fn?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4999",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/fn?",
   :doc
   "Returns true if x implements Fn, i.e. is an object created via fn.",
   :var-type "function",
   :line 4999,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "fnext",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L102",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/fnext",
   :doc "Same as (first (next x))",
   :var-type "function",
   :line 102,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f x] [f x y] [f x y z]),
   :name "fnil",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5694",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/fnil",
   :doc
   "Takes a function f, and returns a function that calls f, replacing\na nil first argument to f with the supplied value x. Higher arity\nversions can replace arguments in the second and third\npositions (y, z). Note that the function f can take any number of\narguments, not just the one(s) being nil-patched.",
   :var-type "function",
   :line 5694,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([seq-exprs body-expr]),
   :name "for",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3582",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/for",
   :doc
   "List comprehension. Takes a vector of one or more\n binding-form/collection-expr pairs, each followed by zero or more\n modifiers, and yields a lazy sequence of evaluations of expr.\n Collections are iterated in a nested fashion, rightmost fastest,\n and nested coll-exprs can refer to bindings created in prior\n binding-forms.  Supported modifiers are: :let [binding-form expr ...],\n :while test, :when test.\n\n(take 100 (for [x (range 100000000) y (range 1000000) :while (< y x)] [x y]))",
   :var-type "macro",
   :line 3582,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "force",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L633",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/force",
   :doc
   "If x is a Delay, returns the (possibly cached) value of its expression, else returns x",
   :var-type "function",
   :line 633,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([fmt & args]),
   :name "format",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4569",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/format",
   :doc
   "Formats a string using java.lang.String.format, see java.util.Formatter for format\nstring syntax",
   :var-type "function",
   :line 4569,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "frequencies",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5576",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/frequencies",
   :doc
   "Returns a map from distinct items in coll to the number of times\nthey appear.",
   :var-type "function",
   :line 5576,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& body]),
   :name "future",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5417",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/future",
   :doc
   "Takes a body of expressions and yields a future object that will\ninvoke the body in another thread, and will cache the result and\nreturn it on all subsequent calls to deref/@. If the computation has\nnot yet finished, calls to deref/@ will block.",
   :var-type "macro",
   :line 5417,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f]),
   :name "future-call",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5399",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/future-call",
   :doc
   "Takes a function of no args and yields a future object that will\ninvoke the function in another thread, and will cache the result and\nreturn it on all subsequent calls to deref/@. If the computation has\nnot yet finished, calls to deref/@ will block.",
   :var-type "function",
   :line 5399,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f]),
   :name "future-cancel",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5426",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/future-cancel",
   :doc "Cancels the future, if possible.",
   :var-type "function",
   :line 5426,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f]),
   :name "future-cancelled?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5431",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/future-cancelled?",
   :doc "Returns true if future f is cancelled",
   :var-type "function",
   :line 5431,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f]),
   :name "future-done?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5250",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/future-done?",
   :doc "Returns true if future f is done",
   :var-type "function",
   :line 5250,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "future?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5245",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/future?",
   :doc "Returns true if x is a future",
   :var-type "function",
   :line 5245,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& options]),
   :name "gen-class",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/60d5927fe7b9a2aa773b58666ad64ffa6379c1fe/src/clj/clojure/genclass.clj#L484",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/60d5927fe7b9a2aa773b58666ad64ffa6379c1fe/src/clj/clojure/genclass.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/gen-class",
   :doc
   "When compiling, generates compiled bytecode for a class with the\ngiven package-qualified :name (which, as all names in these\nparameters, can be a string or symbol), and writes the .class file\nto the *compile-path* directory.  When not compiling, does\nnothing. The gen-class construct contains no implementation, as the\nimplementation will be dynamically sought by the generated class in\nfunctions in an implementing Clojure namespace. Given a generated\nclass org.mydomain.MyClass with a method named mymethod, gen-class\nwill generate an implementation that looks for a function named by \n(str prefix mymethod) (default prefix: \"-\") in a\nClojure namespace specified by :impl-ns\n(defaults to the current namespace). All inherited methods,\ngenerated methods, and init and main functions (see :methods, :init,\nand :main below) will be found similarly prefixed. By default, the\nstatic initializer for the generated class will attempt to load the\nClojure support code for the class as a resource from the classpath,\ne.g. in the example case, ``org/mydomain/MyClass__init.class``. This\nbehavior can be controlled by :load-impl-ns\n\nNote that methods with a maximum of 18 parameters are supported.\n\nIn all subsequent sections taking types, the primitive types can be\nreferred to by their Java names (int, float etc), and classes in the\njava.lang package can be used without a package qualifier. All other\nclasses must be fully qualified.\n\nOptions should be a set of key/value pairs, all except for :name are optional:\n\n:name aname\n\nThe package-qualified name of the class to be generated\n\n:extends aclass\n\nSpecifies the superclass, the non-private methods of which will be\noverridden by the class. If not provided, defaults to Object.\n\n:implements [interface ...]\n\nOne or more interfaces, the methods of which will be implemented by the class.\n\n:init name\n\nIf supplied, names a function that will be called with the arguments\nto the constructor. Must return [ [superclass-constructor-args] state] \nIf not supplied, the constructor args are passed directly to\nthe superclass constructor and the state will be nil\n\n:constructors {[param-types] [super-param-types], ...}\n\nBy default, constructors are created for the generated class which\nmatch the signature(s) of the constructors for the superclass. This\nparameter may be used to explicitly specify constructors, each entry\nproviding a mapping from a constructor signature to a superclass\nconstructor signature. When you supply this, you must supply an :init\nspecifier. \n\n:post-init name\n\nIf supplied, names a function that will be called with the object as\nthe first argument, followed by the arguments to the constructor.\nIt will be called every time an object of this class is created,\nimmediately after all the inherited constructors have completed.\nIt's return value is ignored.\n\n:methods [ [name [param-types] return-type], ...]\n\nThe generated class automatically defines all of the non-private\nmethods of its superclasses/interfaces. This parameter can be used\nto specify the signatures of additional methods of the generated\nclass. Static methods can be specified with ^{:static true} in the\nsignature's metadata. Do not repeat superclass/interface signatures\nhere.\n\n:main boolean\n\nIf supplied and true, a static public main function will be generated. It will\npass each string of the String[] argument as a separate argument to\na function called (str prefix main).\n\n:factory name\n\nIf supplied, a (set of) public static factory function(s) will be\ncreated with the given name, and the same signature(s) as the\nconstructor(s).\n\n:state name\n\nIf supplied, a public final instance field with the given name will be\ncreated. You must supply an :init function in order to provide a\nvalue for the state. Note that, though final, the state can be a ref\nor agent, supporting the creation of Java objects with transactional\nor asynchronous mutation semantics.\n\n:exposes {protected-field-name {:get name :set name}, ...}\n\nSince the implementations of the methods of the generated class\noccur in Clojure functions, they have no access to the inherited\nprotected fields of the superclass. This parameter can be used to\ngenerate public getter/setter methods exposing the protected field(s)\nfor use in the implementation.\n\n:exposes-methods {super-method-name exposed-name, ...}\n\nIt is sometimes necessary to call the superclass' implementation of an\noverridden method.  Those methods may be exposed and referred in \nthe new method implementation by a local name.\n\n:prefix string\n\nDefault: \"-\" Methods called e.g. Foo will be looked up in vars called\nprefixFoo in the implementing ns.\n\n:impl-ns name\n\nDefault: the name of the current ns. Implementations of methods will be \nlooked up in this namespace.\n\n:load-impl-ns boolean\n\nDefault: true. Causes the static initializer for the generated class\nto reference the load code for the implementing namespace. Should be\ntrue when implementing-ns is the default, false if you intend to\nload the code via some other method.",
   :var-type "macro",
   :line 484,
   :file "src/clj/clojure/genclass.clj"}
  {:arglists ([& options]),
   :name "gen-interface",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/60d5927fe7b9a2aa773b58666ad64ffa6379c1fe/src/clj/clojure/genclass.clj#L661",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/60d5927fe7b9a2aa773b58666ad64ffa6379c1fe/src/clj/clojure/genclass.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/gen-interface",
   :doc
   "When compiling, generates compiled bytecode for an interface with\n the given package-qualified :name (which, as all names in these\n parameters, can be a string or symbol), and writes the .class file\n to the *compile-path* directory.  When not compiling, does nothing.\n\n In all subsequent sections taking types, the primitive types can be\n referred to by their Java names (int, float etc), and classes in the\n java.lang package can be used without a package qualifier. All other\n classes must be fully qualified.\n\n Options should be a set of key/value pairs, all except for :name are\n optional:\n\n :name aname\n\n The package-qualified name of the class to be generated\n\n :extends [interface ...]\n\n One or more interfaces, which will be extended by this interface.\n\n :methods [ [name [param-types] return-type], ...]\n\n This parameter is used to specify the signatures of the methods of\n the generated interface.  Do not repeat superinterface signatures\n here.",
   :var-type "macro",
   :line 661,
   :file "src/clj/clojure/genclass.clj"}
  {:arglists ([] [prefix-string]),
   :name "gensym",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L483",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/gensym",
   :doc
   "Returns a new symbol with a unique name. If a prefix string is\nsupplied, the name is prefix# where # is some unique number. If\nprefix is not supplied, the prefix is 'G__'.",
   :var-type "function",
   :line 483,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([map key] [map key not-found]),
   :name "get",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1154",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/get",
   :doc
   "Returns the value mapped to key, not-found or nil if key not present.",
   :var-type "function",
   :line 1154,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([m ks] [m ks not-found]),
   :name "get-in",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4931",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/get-in",
   :doc
   "Returns the value in a nested associative structure,\nwhere ks is a sequence of ke(ys. Returns nil if the key is not present,\nor the not-found value if supplied.",
   :var-type "function",
   :line 4931,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([multifn dispatch-val]),
   :name "get-method",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1382",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/get-method",
   :doc
   "Given a multimethod and a dispatch value, returns the dispatch fn\nthat would apply to that value, or nil if none apply and no default",
   :var-type "function",
   :line 1382,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& bases]),
   :name "get-proxy-class",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj#L250",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/get-proxy-class",
   :doc
   "Takes an optional single class followed by zero or more\ninterfaces. If not supplied class defaults to Object.  Creates an\nreturns an instance of a proxy class derived from the supplied\nclasses. The resulting value is cached and used for any subsequent\nrequests for the same class set. Returns a Class object.",
   :var-type "function",
   :line 250,
   :file "src/clj/clojure/core_proxy.clj"}
  {:arglists ([]),
   :name "get-thread-bindings",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1461",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/get-thread-bindings",
   :doc
   "Get a map with the Var/value pairs which is currently in effect for the\ncurrent thread.",
   :var-type "function",
   :line 1461,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([iref]),
   :name "get-validator",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1818",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/get-validator",
   :doc "Gets the validator-fn for a var/ref/agent/atom.",
   :var-type "function",
   :line 1818,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f coll]),
   :name "group-by",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5551",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/group-by",
   :doc
   "Returns a map of the elements of coll keyed by the result of\nf on each element. The value at each key will be a vector of the\ncorresponding elements, in the order they appeared in coll.",
   :var-type "function",
   :line 5551,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "hash",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4079",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/hash",
   :doc "Returns the hash code of its argument",
   :var-type "function",
   :line 4079,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([] [& keyvals]),
   :name "hash-map",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L321",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/hash-map",
   :doc
   "keyval => key val\nReturns a new hash map with supplied mappings.",
   :var-type "function",
   :line 321,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([] [& keys]),
   :name "hash-set",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L329",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/hash-set",
   :doc "Returns a new hash set with supplied keys.",
   :var-type "function",
   :line 329,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x y]),
   :name "identical?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L646",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/identical?",
   :doc "Tests if 2 arguments are the same object",
   :var-type "function",
   :line 646,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "identity",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1117",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/identity",
   :doc "Returns its argument.",
   :var-type "function",
   :line 1117,
   :file "src/clj/clojure/core.clj"}
  {:forms [(if test then else?)],
   :name "if",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/if",
   :doc
   "Evaluates test. If not the singular values nil or false,\nevaluates and yields then, otherwise, evaluates and yields else. If\nelse is not supplied it defaults to nil.\n\nPlease see http://clojure.org/special_forms#if",
   :var-type "special form",
   :file nil}
  {:arglists ([bindings then] [bindings then else & oldform]),
   :name "if-let",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1403",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/if-let",
   :doc
   "bindings => binding-form test\n\nIf test is true, evaluates then with binding-form bound to the value of \ntest, if not, yields else",
   :var-type "macro",
   :line 1403,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([test then] [test then else]),
   :name "if-not",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L638",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/if-not",
   :doc
   "Evaluates test. If logical false, evaluates and returns then expr, \notherwise else expr, if supplied, else nil.",
   :var-type "macro",
   :line 638,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "ifn?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4993",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ifn?",
   :doc
   "Returns true if x implements IFn. Note that many data structures\n(e.g. sets and maps) implement IFn",
   :var-type "function",
   :line 4993,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& import-symbols-or-lists]),
   :name "import",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2617",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/import",
   :doc
   "import-list => (package-symbol class-name-symbols*)\n\nFor each name in class-name-symbols, adds a mapping from name to the\nclass named by package.name to the current namespace. Use :import in the ns\nmacro in preference to calling this directly.",
   :var-type "macro",
   :line 2617,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([name]),
   :name "in-ns",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/in-ns",
   :doc
   "Sets *ns* to the namespace named by the symbol, creating it if needed.",
   :var-type "function",
   :file nil}
  {:arglists ([x]),
   :name "inc",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L766",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/inc",
   :doc "Returns a number one greater than num.",
   :var-type "function",
   :line 766,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([proxy mappings]),
   :name "init-proxy",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj#L271",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/init-proxy",
   :doc
   "Takes a proxy instance and a map of strings (which must\ncorrespond to methods of the proxy superclass/superinterfaces) to\nfns (which must take arguments matching the corresponding method,\nplus an additional (explicit) first arg corresponding to this, and\nsets the proxy's fn map.",
   :var-type "function",
   :line 271,
   :file "src/clj/clojure/core_proxy.clj"}
  {:arglists ([c x]),
   :name "instance?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L124",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/instance?",
   :doc
   "Evaluates x and tests if it is an instance of the class\nc. Returns true or false",
   :var-type "function",
   :line 124,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "int",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L733",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/int",
   :doc "Coerce to int",
   :var-type "function",
   :line 733,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([size-or-seq] [size init-val-or-seq]),
   :name "int-array",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4191",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/int-array",
   :doc "Creates an array of ints",
   :var-type "function",
   :line 4191,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n]),
   :name "integer?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2724",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/integer?",
   :doc "Returns true if n is an integer",
   :var-type "function",
   :line 2724,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([c1 c2] [c1 c2 & colls]),
   :name "interleave",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3328",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/interleave",
   :doc
   "Returns a lazy seq of the first item in each coll, then the second etc.",
   :var-type "function",
   :line 3328,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ns name] [ns name val]),
   :name "intern",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5067",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/intern",
   :doc
   "Finds or creates a var named by the symbol name in the namespace\nns (which can be a symbol or a namespace), setting its root binding\nto val if supplied. The namespace must exist. The var will adopt any\nmetadata from the name symbol.  Returns the var.",
   :var-type "function",
   :line 5067,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([sep coll]),
   :name "interpose",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4084",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/interpose",
   :doc "Returns a lazy seq of the elements of coll separated by sep",
   :var-type "function",
   :line 4084,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([to from]),
   :name "into",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2608",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/into",
   :doc
   "Returns a new coll consisting of to-coll with all of the items of\nfrom-coll conjoined.",
   :var-type "function",
   :line 2608,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([aseq] [type aseq]),
   :name "into-array",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2635",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/into-array",
   :doc
   "Returns an array with components set to the values in aseq. The array's\ncomponent type is type if provided, or the type of the first value in\naseq if present, or Object. All values in aseq must be compatible with\nthe component type. Class objects for the primitive types can be obtained\nusing, e.g., Integer/TYPE.",
   :var-type "function",
   :line 2635,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([xs]),
   :name "ints",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4232",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ints",
   :doc "Casts to int[]",
   :var-type "function",
   :line 4232,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& body]),
   :name "io!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1920",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/io!",
   :doc
   "If an io! block occurs in a transaction, throws an\nIllegalStateException, else runs body in an implicit do. If the\nfirst expression in body is a literal string, will use that as the\nexception message.",
   :var-type "macro",
   :line 1920,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([child parent] [h child parent]),
   :name "isa?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4400",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/isa?",
   :doc
   "Returns true if (= child parent), or child is directly or indirectly derived from\nparent, either via a Java type inheritance relationship or a\nrelationship established via derive. h must be a hierarchy obtained\nfrom make-hierarchy, if not supplied defaults to the global\nhierarchy",
   :var-type "function",
   :line 4400,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f x]),
   :name "iterate",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2241",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/iterate",
   :doc
   "Returns a lazy sequence of x, (f x), (f (f x)) etc. f must be free of side-effects",
   :var-type "function",
   :line 2241,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([iter]),
   :name "iterator-seq",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4556",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/iterator-seq",
   :doc
   "Returns a seq on a java.util.Iterator. Note that most collections\nproviding iterators implement Iterable and thus support seq directly.",
   :var-type "function",
   :line 4556,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f] [f g] [f g h] [f g h & fs]),
   :name "juxt",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1965",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/juxt",
   :doc
   "Alpha - name subject to change.\nTakes a set of functions and returns a fn that is the juxtaposition\nof those fns.  The returned fn takes a variable number of args, and\nreturns a vector containing the result of applying each fn to the\nargs (left-to-right).\n((juxt a b c) x) => [(a x) (b x) (c x)]",
   :var-type "function",
   :line 1965,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f coll]),
   :name "keep",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5648",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/keep",
   :doc
   "Returns a lazy sequence of the non-nil results of (f item). Note,\nthis means false return values will be included.  f must be free of\nside-effects.",
   :var-type "function",
   :line 5648,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f coll]),
   :name "keep-indexed",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5670",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/keep-indexed",
   :doc
   "Returns a lazy sequence of the non-nil results of (f index item). Note,\nthis means false return values will be included.  f must be free of\nside-effects.",
   :var-type "function",
   :line 5670,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([e]),
   :name "key",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1221",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/key",
   :doc "Returns the key of the map entry.",
   :var-type "function",
   :line 1221,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([map]),
   :name "keys",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1211",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/keys",
   :doc "Returns a sequence of the map's keys.",
   :var-type "function",
   :line 1211,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([name] [ns name]),
   :name "keyword",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L506",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/keyword",
   :doc
   "Returns a Keyword with the given namespace and name.  Do not use :\nin the keyword strings, it will be added automatically.",
   :var-type "function",
   :line 506,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "keyword?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L471",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/keyword?",
   :doc "Return true if x is a Keyword",
   :var-type "function",
   :line 471,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "last",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L223",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/last",
   :doc "Return the last item in coll, in linear time",
   :var-type "function",
   :line 223,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& colls]),
   :name "lazy-cat",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3572",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/lazy-cat",
   :doc
   "Expands to code which yields a lazy sequence of the concatenation\nof the supplied colls.  Each coll expr is not evaluated until it is\nneeded. \n\n(lazy-cat xs ys zs) === (concat (lazy-seq xs) (lazy-seq ys) (lazy-seq zs))",
   :var-type "macro",
   :line 3572,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& body]),
   :name "lazy-seq",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L557",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/lazy-seq",
   :doc
   "Takes a body of expressions that returns an ISeq or nil, and yields\na Seqable object that will invoke the body only the first time seq\nis called, and will cache the result and return it on all subsequent\nseq calls.",
   :var-type "macro",
   :line 557,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([bindings & body]),
   :name "let",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3461",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/let",
   :doc
   "Evaluates the exprs in a lexical context in which the symbols in\nthe binding-forms are bound to their respective init-exprs or parts\ntherein.",
   :var-type "macro",
   :line 3461,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([fnspecs & body]),
   :name "letfn",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5256",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/letfn",
   :doc
   "Takes a vector of function specs and a body, and generates a set of\nbindings of functions to their names. All of the names are available\nin all of the definitions of the functions, as well as the body.\n\nfnspec ==> (fname [params*] exprs) or (fname ([params*] exprs)+)",
   :var-type "macro",
   :line 5256,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([rdr]),
   :name "line-seq",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2314",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/line-seq",
   :doc
   "Returns the lines of text from rdr as a lazy sequence of strings.\nrdr must implement java.io.BufferedReader.",
   :var-type "function",
   :line 2314,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& items]),
   :name "list",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L16",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/list",
   :doc "Creates a new list containing the items.",
   :var-type "function",
   :line 16,
   :file "src/clj/clojure/core.clj"}
  {:arglists
   ([args] [a args] [a b args] [a b c args] [a b c d & more]),
   :name "list*",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L524",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/list*",
   :doc
   "Creates a new list containing the items prepended to the rest, the\nlast of which will be treated as a sequence.",
   :var-type "function",
   :line 524,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "list?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4983",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/list?",
   :doc "Returns true if x implements IPersistentList",
   :var-type "function",
   :line 4983,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& paths]),
   :name "load",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4899",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/load",
   :doc
   "Loads Clojure code from resources in classpath. A path is interpreted as\nclasspath-relative if it begins with a slash or relative to the root\ndirectory for the current namespace otherwise.",
   :var-type "function",
   :line 4899,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([name]),
   :name "load-file",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/load-file",
   :doc
   "Sequentially read and evaluate the set of forms contained in the file.",
   :var-type "function",
   :file nil}
  {:arglists ([rdr]),
   :name "load-reader",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3148",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/load-reader",
   :doc
   "Sequentially read and evaluate the set of forms contained in the\nstream/file",
   :var-type "function",
   :line 3148,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([s]),
   :name "load-string",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3154",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/load-string",
   :doc
   "Sequentially read and evaluate the set of forms contained in the\nstring",
   :var-type "function",
   :line 3154,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([]),
   :name "loaded-libs",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4894",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/loaded-libs",
   :doc
   "Returns a sorted set of symbols naming the currently loaded libs",
   :var-type "function",
   :line 4894,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x & body]),
   :name "locking",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1254",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/locking",
   :doc
   "Executes exprs in an implicit do, while holding the monitor of x.\nWill release the monitor of x in all circumstances.",
   :var-type "macro",
   :line 1254,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "long",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2669",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/long",
   :doc "Coerce to long",
   :var-type "function",
   :line 2669,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([size-or-seq] [size init-val-or-seq]),
   :name "long-array",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4199",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/long-array",
   :doc "Creates an array of longs",
   :var-type "function",
   :line 4199,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([xs]),
   :name "longs",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4242",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/longs",
   :doc "Casts to long[]",
   :var-type "function",
   :line 4242,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([bindings & body]),
   :name "loop",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3533",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/loop",
   :doc
   "Evaluates the exprs in a lexical context in which the symbols in\nthe binding-forms are bound to their respective init-exprs or parts\ntherein. Acts as a recur target.",
   :var-type "macro",
   :line 3533,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([form]),
   :name "macroexpand",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3098",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/macroexpand",
   :doc
   "Repeatedly calls macroexpand-1 on form until it no longer\nrepresents a macro form, then returns it.  Note neither\nmacroexpand-1 nor macroexpand expand macros in subforms.",
   :var-type "function",
   :line 3098,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([form]),
   :name "macroexpand-1",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3091",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/macroexpand-1",
   :doc
   "If form represents a macro form, returns its expansion,\nelse returns form.",
   :var-type "function",
   :line 3091,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([type len] [type dim & more-dims]),
   :name "make-array",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3061",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/make-array",
   :doc
   "Creates and returns an array of instances of the specified class of\nthe specified dimension(s).  Note that a class object is required.\nClass objects can be obtained by using their imported or\nfully-qualified name.  Class objects for the primitive types can be\nobtained using, e.g., Integer/TYPE.",
   :var-type "function",
   :line 3061,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([]),
   :name "make-hierarchy",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4367",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/make-hierarchy",
   :doc "Creates a hierarchy object for use with derive, isa? etc.",
   :var-type "function",
   :line 4367,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f coll] [f c1 c2] [f c1 c2 c3] [f c1 c2 c3 & colls]),
   :name "map",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2079",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/map",
   :doc
   "Returns a lazy sequence consisting of the result of applying f to the\nset of first items of each coll, followed by applying f to the set\nof second items in each coll, until any one of the colls is\nexhausted.  Any remaining items in other colls are ignored. Function\nf should accept number-of-colls arguments.",
   :var-type "function",
   :line 2079,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f coll]),
   :name "map-indexed",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5628",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/map-indexed",
   :doc
   "Returns a lazy sequence consisting of the result of applying f to 0\nand the first item of coll, followed by applying f to 1 and the second\nitem in coll, etc, until coll is exhausted. Thus function f should\naccept 2 arguments, index and item.",
   :var-type "function",
   :line 5628,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "map?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L149",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/map?",
   :doc "Return true if x implements IPersistentMap",
   :var-type "function",
   :line 149,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f & colls]),
   :name "mapcat",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2117",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/mapcat",
   :doc
   "Returns the result of applying concat to the result of applying map\nto f and colls.  Thus function f should return a collection.",
   :var-type "function",
   :line 2117,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "max",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L912",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/max",
   :doc "Returns the greatest of the nums.",
   :var-type "function",
   :line 912,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([k x] [k x y] [k x y & more]),
   :name "max-key",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3947",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/max-key",
   :doc "Returns the x for which (k x), a number, is greatest.",
   :var-type "function",
   :line 3947,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([name & args]),
   :name "memfn",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2949",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/memfn",
   :doc
   "Expands into code that creates a fn that expects to be passed an\nobject and any args and calls the named instance method on the\nobject passing the args. Use when you want to treat a Java method as\na first-class fn.",
   :var-type "macro",
   :line 2949,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f]),
   :name "memoize",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5092",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/memoize",
   :doc
   "Returns a memoized version of a referentially transparent function. The\nmemoized version of the function keeps a cache of the mapping from arguments\nto results and, when calls with the same arguments are repeated often, has\nhigher performance at the expense of higher memory use.",
   :var-type "function",
   :line 5092,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& maps]),
   :name "merge",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2268",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/merge",
   :doc
   "Returns a map that consists of the rest of the maps conj-ed onto\nthe first.  If a key occurs in more than one map, the mapping from\nthe latter (left-to-right) will be the mapping in the result.",
   :var-type "function",
   :line 2268,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f & maps]),
   :name "merge-with",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2277",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/merge-with",
   :doc
   "Returns a map that consists of the rest of the maps conj-ed onto\nthe first.  If a key occurs in more than one map, the mapping(s)\nfrom the latter (left-to-right) will be combined with the mapping in\nthe result by calling (f val-in-result val-in-latter).",
   :var-type "function",
   :line 2277,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([obj]),
   :name "meta",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L178",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/meta",
   :doc
   "Returns the metadata of obj, returns nil if there is no metadata.",
   :var-type "function",
   :line 178,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([multifn]),
   :name "methods",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1377",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/methods",
   :doc
   "Given a multimethod, returns a map of dispatch values -> dispatch fns",
   :var-type "function",
   :line 1377,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "min",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L920",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/min",
   :doc "Returns the least of the nums.",
   :var-type "function",
   :line 920,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([k x] [k x y] [k x y & more]),
   :name "min-key",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3955",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/min-key",
   :doc "Returns the x for which (k x), a number, is least.",
   :var-type "function",
   :line 3955,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([num div]),
   :name "mod",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2734",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/mod",
   :doc "Modulus of num and div. Truncates toward negative infinity.",
   :var-type "function",
   :line 2734,
   :file "src/clj/clojure/core.clj"}
  {:forms [(monitor-enter x)],
   :name "monitor-enter",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/monitor-enter",
   :doc
   "Synchronization primitive that should be avoided\nin user code. Use the 'locking' macro.\n\nPlease see http://clojure.org/special_forms#monitor-enter",
   :var-type "special form",
   :file nil}
  {:forms [(monitor-exit x)],
   :name "monitor-exit",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/monitor-exit",
   :doc
   "Synchronization primitive that should be avoided\nin user code. Use the 'locking' macro.\n\nPlease see http://clojure.org/special_forms#monitor-exit",
   :var-type "special form",
   :file nil}
  {:arglists ([x]),
   :name "name",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1240",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/name",
   :doc "Returns the name String of a string, symbol or keyword.",
   :var-type "function",
   :line 1240,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "namespace",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1247",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/namespace",
   :doc
   "Returns the namespace String of a symbol or keyword, or nil if not present.",
   :var-type "function",
   :line 1247,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ns]),
   :name "namespace-munge",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj#L13",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/namespace-munge",
   :doc
   "Convert a Clojure namespace name to a legal Java package name.",
   :var-type "function",
   :line 13,
   :file "src/clj/clojure/core_deftype.clj"}
  {:arglists ([x]),
   :name "neg?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L997",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/neg?",
   :doc "Returns true if num is less than zero, else false",
   :var-type "function",
   :line 997,
   :file "src/clj/clojure/core.clj"}
  {:forms [(Classname. args*) (new Classname args*)],
   :name "new",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/new",
   :doc
   "The args, if any, are evaluated from left to right, and\npassed to the constructor of the class named by Classname. The\nconstructed object is returned.\n\nPlease see http://clojure.org/java_interop#new",
   :var-type "special form",
   :file nil}
  {:arglists ([]),
   :name "newline",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2832",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/newline",
   :doc
   "Writes a newline to the output stream that is the current value of\n*out*",
   :var-type "function",
   :line 2832,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "next",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L55",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/next",
   :doc
   "Returns a seq of the items after the first. Calls seq on its\nargument.  If there are no more items, returns nil.",
   :var-type "function",
   :line 55,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "nfirst",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L96",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/nfirst",
   :doc "Same as (next (first x))",
   :var-type "function",
   :line 96,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "nil?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L364",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/nil?",
   :doc "Returns true if x is nil, false otherwise.",
   :var-type "function",
   :line 364,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "nnext",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L108",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/nnext",
   :doc "Same as (next (next x))",
   :var-type "function",
   :line 108,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "not",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L443",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/not",
   :doc "Returns true if x is logical false, false otherwise.",
   :var-type "function",
   :line 443,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([pred coll]),
   :name "not-any?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2055",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/not-any?",
   :doc
   "Returns false if (pred x) is logical true for any x in coll,\nelse true.",
   :var-type "function",
   :line 2055,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "not-empty",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4375",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/not-empty",
   :doc "If coll is empty, returns nil, else coll",
   :var-type "function",
   :line 4375,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([pred coll]),
   :name "not-every?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2037",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/not-every?",
   :doc
   "Returns false if (pred x) is logical true for every x in\ncoll, else true.",
   :var-type "function",
   :line 2037,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x y] [x y & more]),
   :name "not=",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L671",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/not=",
   :doc "Same as (not (= obj1 obj2))",
   :var-type "function",
   :line 671,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([name docstring? attr-map? references*]),
   :name "ns",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4594",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ns",
   :doc
   "Sets *ns* to the namespace named by name (unevaluated), creating it\nif needed.  references can be zero or more of: (:refer-clojure ...)\n(:require ...) (:use ...) (:import ...) (:load ...) (:gen-class)\nwith the syntax of refer-clojure/require/use/import/load/gen-class\nrespectively, except the arguments are unevaluated and need not be\nquoted. (:gen-class ...), when supplied, defaults to :name\ncorresponding to the ns name, :main true, :impl-ns same as ns, and\n:init-impl-ns true. All options of gen-class are\nsupported. The :gen-class directive is ignored when not\ncompiling. If :gen-class is not supplied, when compiled only an\nnsname__init.class will be generated. If :refer-clojure is not used, a\ndefault (refer 'clojure) is used.  Use of ns is preferred to\nindividual calls to in-ns/require/use/import:\n\n(ns foo.bar\n  (:refer-clojure :exclude [ancestors printf])\n  (:require (clojure.contrib sql sql.tests))\n  (:use (my.lib this that))\n  (:import (java.util Date Timer Random)\n           (java.sql Connection Statement)))",
   :var-type "macro",
   :line 4594,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ns]),
   :name "ns-aliases",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3308",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ns-aliases",
   :doc "Returns a map of the aliases for the namespace.",
   :var-type "function",
   :line 3308,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ns]),
   :name "ns-imports",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3242",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ns-imports",
   :doc "Returns a map of the import mappings for the namespace.",
   :var-type "function",
   :line 3242,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ns]),
   :name "ns-interns",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3248",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ns-interns",
   :doc "Returns a map of the intern mappings for the namespace.",
   :var-type "function",
   :line 3248,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ns]),
   :name "ns-map",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3216",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ns-map",
   :doc "Returns a map of all the mappings for the namespace.",
   :var-type "function",
   :line 3216,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ns]),
   :name "ns-name",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3210",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ns-name",
   :doc "Returns the name of the namespace, a symbol.",
   :var-type "function",
   :line 3210,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ns]),
   :name "ns-publics",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3232",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ns-publics",
   :doc
   "Returns a map of the public intern mappings for the namespace.",
   :var-type "function",
   :line 3232,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ns]),
   :name "ns-refers",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3290",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ns-refers",
   :doc "Returns a map of the refer mappings for the namespace.",
   :var-type "function",
   :line 3290,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ns sym]),
   :name "ns-resolve",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3373",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ns-resolve",
   :doc
   "Returns the var or Class to which a symbol will be resolved in the\nnamespace, else nil.  Note that if the symbol is fully qualified,\nthe var/Class to which it resolves need not be present in the\nnamespace.",
   :var-type "function",
   :line 3373,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ns sym]),
   :name "ns-unalias",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3314",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ns-unalias",
   :doc "Removes the alias for the symbol from the namespace.",
   :var-type "function",
   :line 3314,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ns sym]),
   :name "ns-unmap",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3222",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ns-unmap",
   :doc "Removes the mappings for the symbol from the namespace.",
   :var-type "function",
   :line 3222,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll index] [coll index not-found]),
   :name "nth",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L740",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/nth",
   :doc
   "Returns the value at the index. get returns nil if index out of\nbounds, nth throws an exception unless not-found is supplied.  nth\nalso works for strings, Java arrays, regex Matchers and Lists, and,\nin O(n) time, for sequences.",
   :var-type "function",
   :line 740,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll n]),
   :name "nthnext",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3393",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/nthnext",
   :doc "Returns the nth next of coll, (seq coll) when n is 0.",
   :var-type "function",
   :line 3393,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "num",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2662",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/num",
   :doc "Coerce to Number",
   :var-type "function",
   :line 2662,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "number?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2718",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/number?",
   :doc "Returns true if x is a Number",
   :var-type "function",
   :line 2718,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([r]),
   :name "numerator",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2748",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/numerator",
   :doc "Returns the numerator part of a Ratio.",
   :var-type "function",
   :line 2748,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([size-or-seq]),
   :name "object-array",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4184",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/object-array",
   :doc "Creates an array of objects",
   :var-type "function",
   :line 4184,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n]),
   :name "odd?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1093",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/odd?",
   :doc
   "Returns true if n is odd, throws an exception if n is not an integer",
   :var-type "function",
   :line 1093,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([] [x] [x & next]),
   :name "or",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L705",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/or",
   :doc
   "Evaluates exprs one at a time, from left to right. If a form\nreturns a logical true value, or returns that value and doesn't\nevaluate any of the other expressions, otherwise it returns the\nvalue of the last expression. (or) returns nil.",
   :var-type "macro",
   :line 705,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([tag] [h tag]),
   :name "parents",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4421",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/parents",
   :doc
   "Returns the immediate parents of tag, either via a Java type\ninheritance relationship or a relationship established via derive. h\nmust be a hierarchy obtained from make-hierarchy, if not supplied\ndefaults to the global hierarchy",
   :var-type "function",
   :line 4421,
   :file "src/clj/clojure/core.clj"}
  {:arglists
   ([f arg1]
    [f arg1 arg2]
    [f arg1 arg2 arg3]
    [f arg1 arg2 arg3 & more]),
   :name "partial",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2003",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/partial",
   :doc
   "Takes a function f and fewer than the normal arguments to f, and\nreturns a fn that takes a variable number of additional args. When\ncalled, the returned function calls f with args + additional args.",
   :var-type "function",
   :line 2003,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n coll] [n step coll] [n step pad coll]),
   :name "partition",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2354",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/partition",
   :doc
   "Returns a lazy sequence of lists of n items each, at offsets step\napart. If step is not supplied, defaults to n, i.e. the partitions\ndo not overlap. If a pad collection is supplied, use its elements as\nnecessary to complete last partition upto n items. In case there are\nnot enough padding elements, return a partition with less than n items.",
   :var-type "function",
   :line 2354,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n coll] [n step coll]),
   :name "partition-all",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5609",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/partition-all",
   :doc
   "Returns a lazy sequence of lists like partition, but may include\npartitions with fewer than n items at the end.",
   :var-type "function",
   :line 5609,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f coll]),
   :name "partition-by",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5564",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/partition-by",
   :doc
   "Applies f to each value in coll, splitting it each time f returns\na new value.  Returns a lazy seq of partitions.",
   :var-type "function",
   :line 5564,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& fns]),
   :name "pcalls",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5460",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/pcalls",
   :doc
   "Executes the no-arg fns in parallel, returning a lazy sequence of\ntheir values",
   :var-type "function",
   :line 5460,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "peek",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1129",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/peek",
   :doc
   "For a list or queue, same as first, for a vector, same as, but much\nmore efficient than, last. If the collection is empty, returns nil.",
   :var-type "function",
   :line 1129,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "persistent!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2544",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/persistent!",
   :doc
   "Alpha - subject to change.\nReturns a new, persistent version of the transient collection, in\nconstant time. The transient collection cannot be used after this\ncall, any such use will throw an exception.",
   :var-type "function",
   :line 2544,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f coll] [f coll & colls]),
   :name "pmap",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5436",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/pmap",
   :doc
   "Like map, except f is applied in parallel. Semi-lazy in that the\nparallel computation stays ahead of the consumption, but doesn't\nrealize the entire result unless required. Only useful for\ncomputationally intensive functions where the time of f dominates\nthe coordination overhead.",
   :var-type "function",
   :line 5436,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "pop",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1135",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/pop",
   :doc
   "For a list or queue, returns a new list/queue without the first\nitem, for a vector, returns a new vector without the last item. If\nthe collection is empty, throws an exception.  Note - not the same\nas next/butlast.",
   :var-type "function",
   :line 1135,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "pop!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2585",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/pop!",
   :doc
   "Alpha - subject to change.\nRemoves the last item from a transient vector. If\nthe collection is empty, throws an exception. Returns coll",
   :var-type "function",
   :line 2585,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([]),
   :name "pop-thread-bindings",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1454",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/pop-thread-bindings",
   :doc
   "Pop one set of bindings pushed with push-binding before. It is an error to\npop bindings without pushing before.",
   :var-type "function",
   :line 1454,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "pos?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L990",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/pos?",
   :doc "Returns true if num is greater than zero, else false",
   :var-type "function",
   :line 990,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([] [x] [x & more]),
   :name "pr",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2815",
   :dynamic true,
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/pr",
   :doc
   "Prints the object(s) to the output stream that is the current value\nof *out*.  Prints the object(s), separated by spaces if there is\nmore than one.  By default, pr and prn print in a way that objects\ncan be read by the reader",
   :var-type "function",
   :line 2815,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& xs]),
   :name "pr-str",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3694",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/pr-str",
   :doc "pr to a string, returning it",
   :var-type "function",
   :line 3694,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([multifn dispatch-val-x dispatch-val-y]),
   :name "prefer-method",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1370",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/prefer-method",
   :doc
   "Causes the multimethod to prefer matches of dispatch-val-x over dispatch-val-y \nwhen there is a conflict",
   :var-type "function",
   :line 1370,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([multifn]),
   :name "prefers",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1388",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/prefers",
   :doc
   "Given a multimethod, returns a map of preferred value -> set of other values",
   :var-type "function",
   :line 1388,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& more]),
   :name "print",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2857",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/print",
   :doc
   "Prints the object(s) to the output stream that is the current value\nof *out*.  print and println produce output for human consumption.",
   :var-type "function",
   :line 2857,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([nspace]),
   :name "print-namespace-doc",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3872",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/print-namespace-doc",
   :doc "Print the documentation string of a Namespace.",
   :var-type "function",
   :line 3872,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& xs]),
   :name "print-str",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3710",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/print-str",
   :doc "print to a string, returning it",
   :var-type "function",
   :line 3710,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([fmt & args]),
   :name "printf",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4577",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/printf",
   :doc "Prints formatted output, as per format",
   :var-type "function",
   :line 4577,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& more]),
   :name "println",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2865",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/println",
   :doc "Same as print followed by (newline)",
   :var-type "function",
   :line 2865,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& xs]),
   :name "println-str",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3718",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/println-str",
   :doc "println to a string, returning it",
   :var-type "function",
   :line 3718,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& more]),
   :name "prn",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2848",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/prn",
   :doc
   "Same as pr followed by (newline). Observes *flush-on-newline*",
   :var-type "function",
   :line 2848,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& xs]),
   :name "prn-str",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3702",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/prn-str",
   :doc "prn to a string, returning it",
   :var-type "function",
   :line 3702,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([]),
   :name "promise",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5511",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/promise",
   :doc
   "Alpha - subject to change.\nReturns a promise object that can be read with deref/@, and set,\nonce only, with deliver. Calls to deref/@ prior to delivery will\nblock. All subsequent derefs will return the same delivered value\nwithout blocking.",
   :var-type "function",
   :line 5511,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([class-and-interfaces args & fs]),
   :name "proxy",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj#L300",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/proxy",
   :doc
   "class-and-interfaces - a vector of class names\n\nargs - a (possibly empty) vector of arguments to the superclass\nconstructor.\n\nf => (name [params*] body) or\n(name ([params*] body) ([params+] body) ...)\n\nExpands to code which creates a instance of a proxy class that\nimplements the named class/interface(s) by calling the supplied\nfns. A single class, if provided, must be first. If not provided it\ndefaults to Object.\n\nThe interfaces names must be valid interface types. If a method fn\nis not provided for a class method, the superclass methd will be\ncalled. If a method fn is not provided for an interface method, an\nUnsupportedOperationException will be thrown should it be\ncalled. Method fns are closures and can capture the environment in\nwhich proxy is called. Each method fn takes an additional implicit\nfirst arg, which is bound to 'this. Note that while method fns can\nbe provided to override protected methods, they have no other access\nto protected members, nor to super, as these capabilities cannot be\nproxied.",
   :var-type "macro",
   :line 300,
   :file "src/clj/clojure/core_proxy.clj"}
  {:arglists ([proxy]),
   :name "proxy-mappings",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj#L294",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/proxy-mappings",
   :doc "Takes a proxy instance and returns the proxy's fn map.",
   :var-type "function",
   :line 294,
   :file "src/clj/clojure/core_proxy.clj"}
  {:arglists ([meth & args]),
   :name "proxy-super",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj#L362",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/proxy-super",
   :doc
   "Use to call a superclass method in the body of a proxy method. \nNote, expansion captures 'this",
   :var-type "macro",
   :line 362,
   :file "src/clj/clojure/core_proxy.clj"}
  {:arglists ([bindings]),
   :name "push-thread-bindings",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1437",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/push-thread-bindings",
   :doc
   "WARNING: This is a low-level function. Prefer high-level macros like\nbinding where ever possible.\n\nTakes a map of Var/value pairs. Binds each Var to the associated value for\nthe current thread. Each call *MUST* be accompanied by a matching call to\npop-thread-bindings wrapped in a try-finally!\n\n    (push-thread-bindings bindings)\n    (try\n      ...\n      (finally\n        (pop-thread-bindings)))",
   :var-type "function",
   :line 1437,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& exprs]),
   :name "pvalues",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5466",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/pvalues",
   :doc
   "Returns a lazy sequence of the values of the exprs, which are\nevaluated in parallel",
   :var-type "macro",
   :line 5466,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([num div]),
   :name "quot",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1004",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/quot",
   :doc "quot[ient] of dividing numerator by denominator.",
   :var-type "function",
   :line 1004,
   :file "src/clj/clojure/core.clj"}
  {:forms ['form],
   :name "quote",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/quote",
   :doc
   "Yields the unevaluated form.\n\nPlease see http://clojure.org/special_forms#quote",
   :var-type "special form",
   :file nil}
  {:arglists ([] [n]),
   :name "rand",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3811",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/rand",
   :doc
   "Returns a random floating point number between 0 (inclusive) and\nn (default 1) (exclusive).",
   :var-type "function",
   :line 3811,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n]),
   :name "rand-int",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3818",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/rand-int",
   :doc
   "Returns a random integer between 0 (inclusive) and n (exclusive).",
   :var-type "function",
   :line 3818,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "rand-nth",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5601",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/rand-nth",
   :doc
   "Return a random element of the (sequential) collection. Will have\nthe same performance characteristics as nth for the given\ncollection.",
   :var-type "function",
   :line 5601,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([] [end] [start end] [start end step]),
   :name "range",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2246",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/range",
   :doc
   "Returns a lazy seq of nums from start (inclusive) to end\n(exclusive), by step, where start defaults to 0, step to 1, and end\nto infinity.",
   :var-type "function",
   :line 2246,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n]),
   :name "ratio?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2743",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ratio?",
   :doc "Returns true if n is a Ratio",
   :var-type "function",
   :line 2743,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([num]),
   :name "rationalize",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1016",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/rationalize",
   :doc "returns the rational value of num",
   :var-type "function",
   :line 1016,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([m] [re s]),
   :name "re-find",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3799",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/re-find",
   :doc
   "Returns the next regex match, if any, of string to pattern, using\njava.util.regex.Matcher.find().  Uses re-groups to return the\ngroups.",
   :var-type "function",
   :line 3799,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([m]),
   :name "re-groups",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3762",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/re-groups",
   :doc
   "Returns the groups from the most recent match/find. If there are no\nnested groups, returns a string of the entire match. If there are\nnested groups, returns a vector of the groups, the first element\nbeing the entire match.",
   :var-type "function",
   :line 3762,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([re s]),
   :name "re-matcher",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3754",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/re-matcher",
   :doc
   "Returns an instance of java.util.regex.Matcher, for use, e.g. in\nre-find.",
   :var-type "function",
   :line 3754,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([re s]),
   :name "re-matches",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3788",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/re-matches",
   :doc
   "Returns the match, if any, of string to pattern, using\njava.util.regex.Matcher.matches().  Uses re-groups to return the\ngroups.",
   :var-type "function",
   :line 3788,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([s]),
   :name "re-pattern",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3745",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/re-pattern",
   :doc
   "Returns an instance of java.util.regex.Pattern, for use, e.g. in\nre-matcher.",
   :var-type "function",
   :line 3745,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([re s]),
   :name "re-seq",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3777",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/re-seq",
   :doc
   "Returns a lazy sequence of successive matches of pattern in string,\nusing java.util.regex.Matcher.find(), each such match processed with\nre-groups.",
   :var-type "function",
   :line 3777,
   :file "src/clj/clojure/core.clj"}
  {:arglists
   ([]
    [stream]
    [stream eof-error? eof-value]
    [stream eof-error? eof-value recursive?]),
   :name "read",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2872",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/read",
   :doc
   "Reads the next object from stream, which must be an instance of\njava.io.PushbackReader or some derivee.  stream defaults to the\ncurrent value of *in* .",
   :var-type "function",
   :line 2872,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([]),
   :name "read-line",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2886",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/read-line",
   :doc
   "Reads the next line from stream that is the current value of *in* .",
   :var-type "function",
   :line 2886,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([s]),
   :name "read-string",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2894",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/read-string",
   :doc "Reads one object from the string s",
   :var-type "function",
   :line 2894,
   :file "src/clj/clojure/core.clj"}
  {:forms [(recur exprs*)],
   :name "recur",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/recur",
   :doc
   "Evaluates the exprs in order, then, in parallel, rebinds\nthe bindings of the recursion point to the values of the exprs.\nExecution then jumps back to the recursion point, a loop or fn method.\n\nPlease see http://clojure.org/special_forms#recur",
   :var-type "special form",
   :file nil}
  {:arglists ([f coll] [f val coll]),
   :name "reduce",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L773",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/reduce",
   :doc
   "f should be a function of 2 arguments. If val is not supplied,\nreturns the result of applying f to the first 2 items in coll, then\napplying f to that result and the 3rd item, etc. If coll contains no\nitems, f must accept no arguments as well, and reduce returns the\nresult of calling f with no arguments.  If coll has only 1 item, it\nis returned and f is not called.  If val is supplied, returns the\nresult of applying f to val and the first item in coll, then\napplying f to that result and the 2nd item, etc. If coll contains no\nitems, returns val and f is not called.",
   :var-type "function",
   :line 773,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f coll] [f init coll]),
   :name "reductions",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5586",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/reductions",
   :doc
   "Returns a lazy seq of the intermediate values of the reduction (as\nper reduce) of coll by f, starting with init.",
   :var-type "function",
   :line 5586,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [x & options]),
   :name "ref",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1723",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ref",
   :doc
   "Creates and returns a Ref with an initial value of x and zero or\nmore options (in any order):\n\n:meta metadata-map\n\n:validator validate-fn\n\n:min-history (default 0)\n:max-history (default 10)\n\nIf metadata-map is supplied, it will be come the metadata on the\nref. validate-fn must be nil or a side-effect-free fn of one\nargument, which will be passed the intended new state on any state\nchange. If the new state is unacceptable, the validate-fn should\nreturn false or throw an exception. validate-fn will be called on\ntransaction commit, when all refs have their final values.\n\nNormally refs accumulate history dynamically as needed to deal with\nread demands. If you know in advance you will need history you can\nset :min-history to ensure it will be available when first needed (instead\nof after a read fault). History is limited, and the limit can be set\nwith :max-history.",
   :var-type "function",
   :line 1723,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ref]),
   :name "ref-history-count",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1875",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ref-history-count",
   :doc "Returns the history count of a ref",
   :var-type "function",
   :line 1875,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ref] [ref n]),
   :name "ref-max-history",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1889",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ref-max-history",
   :doc
   "Gets the max-history of a ref, or sets it and returns the ref",
   :var-type "function",
   :line 1889,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ref] [ref n]),
   :name "ref-min-history",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1881",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ref-min-history",
   :doc
   "Gets the min-history of a ref, or sets it and returns the ref",
   :var-type "function",
   :line 1881,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ref val]),
   :name "ref-set",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1868",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/ref-set",
   :doc
   "Must be called in a transaction. Sets the value of ref.\nReturns val.",
   :var-type "function",
   :line 1868,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([ns-sym & filters]),
   :name "refer",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3257",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/refer",
   :doc
   "refers to all public vars of ns, subject to filters.\nfilters can include at most one each of:\n\n:exclude list-of-symbols\n:only list-of-symbols\n:rename map-of-fromsymbol-tosymbol\n\nFor each public interned var in the namespace named by the symbol,\nadds a mapping from the name of the var to the var to the current\nnamespace.  Throws an exception if name is already mapped to\nsomething else in the current namespace. Filters can be used to\nselect a subset, via inclusion or exclusion, or to provide a mapping\nto a symbol different from the var's name, in order to prevent\nclashes. Use :use in the ns macro in preference to calling this directly.",
   :var-type "function",
   :line 3257,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& filters]),
   :name "refer-clojure",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4647",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/refer-clojure",
   :doc "Same as (refer 'clojure.core <filters>)",
   :var-type "macro",
   :line 4647,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& opts+specs]),
   :name "reify",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj#L62",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/reify",
   :doc
   "reify is a macro with the following structure:\n\n(reify options* specs*)\n \n Currently there are no options.\n\n Each spec consists of the protocol or interface name followed by zero\n or more method bodies:\n\n protocol-or-interface-or-Object\n (methodName [args+] body)*\n\n Methods should be supplied for all methods of the desired\n protocol(s) and interface(s). You can also define overrides for\n methods of Object. Note that the first parameter must be supplied to\n correspond to the target object ('this' in Java parlance). Thus\n methods for interfaces will take one more argument than do the\n interface declarations.  Note also that recur calls to the method\n head should *not* pass the target object, it will be supplied\n automatically and can not be substituted.\n\n The return type can be indicated by a type hint on the method name,\n and arg types can be indicated by a type hint on arg names. If you\n leave out all hints, reify will try to match on same name/arity\n method in the protocol(s)/interface(s) - this is preferred. If you\n supply any hints at all, no inference is done, so all hints (or\n default of Object) must be correct, for both arguments and return\n type. If a method is overloaded in a protocol/interface, multiple\n independent method definitions must be supplied.  If overloaded with\n same arity in an interface you must specify complete hints to\n disambiguate - a missing hint implies Object.\n\n recur works to method heads The method bodies of reify are lexical\n closures, and can refer to the surrounding local scope:\n \n (str (let [f \"foo\"] \n      (reify Object \n        (toString [this] f))))\n == \"foo\"\n\n (seq (let [f \"foo\"] \n      (reify clojure.lang.Seqable \n        (seq [this] (seq f)))))\n == (\\f \\o \\o))",
   :var-type "macro",
   :line 62,
   :file "src/clj/clojure/core_deftype.clj"}
  {:arglists ([]),
   :name "release-pending-sends",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1603",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/release-pending-sends",
   :doc
   "Normally, actions sent directly or indirectly during another action\nare held until the action completes (changes the agent's\nstate). This function can be used to dispatch any pending sent\nactions immediately. This has no impact on actions sent during a\ntransaction, which are still held until commit. If no action is\noccurring, does nothing. Returns the number of actions dispatched.",
   :var-type "function",
   :line 1603,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([num div]),
   :name "rem",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1010",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/rem",
   :doc "remainder of dividing numerator by denominator.",
   :var-type "function",
   :line 1010,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([pred coll]),
   :name "remove",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2145",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/remove",
   :doc
   "Returns a lazy sequence of the items in coll for which\n(pred item) returns false. pred must be free of side-effects.",
   :var-type "function",
   :line 2145,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([multifn]),
   :name "remove-all-methods",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1358",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/remove-all-methods",
   :doc "Removes all of the methods of multimethod.",
   :var-type "function",
   :line 1358,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([multifn dispatch-val]),
   :name "remove-method",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1364",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/remove-method",
   :doc
   "Removes the method of multimethod associated with dispatch-value.",
   :var-type "function",
   :line 1364,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([sym]),
   :name "remove-ns",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3189",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/remove-ns",
   :doc
   "Removes the namespace named by the symbol. Use with caution.\nCannot be used to remove the clojure namespace.",
   :var-type "function",
   :line 3189,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([reference key]),
   :name "remove-watch",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1631",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/remove-watch",
   :doc
   "Alpha - subject to change.\nRemoves a watch (set by add-watch) from a reference",
   :var-type "function",
   :line 1631,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x] [n x]),
   :name "repeat",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2230",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/repeat",
   :doc
   "Returns a lazy (infinite!, or length n if supplied) sequence of xs.",
   :var-type "function",
   :line 2230,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f] [n f]),
   :name "repeatedly",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4058",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/repeatedly",
   :doc
   "Takes a function of no args, presumably with side effects, and\nreturns an infinite (or length n if supplied) lazy sequence of calls\nto it",
   :var-type "function",
   :line 4058,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([smap coll]),
   :name "replace",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3979",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/replace",
   :doc
   "Given a map of replacement pairs and a vector/collection, returns a\nvector/seq with any elements = a key in smap replaced with the\ncorresponding val in smap",
   :var-type "function",
   :line 3979,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n x]),
   :name "replicate",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2236",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/replicate",
   :doc "Returns a lazy seq of n xs.",
   :var-type "function",
   :line 2236,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& args]),
   :name "require",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4821",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/require",
   :doc
   "Loads libs, skipping any that are already loaded. Each argument is\neither a libspec that identifies a lib, a prefix list that identifies\nmultiple libs whose names share a common prefix, or a flag that modifies\nhow all the identified libs are loaded. Use :require in the ns macro\nin preference to calling this directly.\n\nLibs\n\nA 'lib' is a named set of resources in classpath whose contents define a\nlibrary of Clojure code. Lib names are symbols and each lib is associated\nwith a Clojure namespace and a Java package that share its name. A lib's\nname also locates its root directory within classpath using Java's\npackage name to classpath-relative path mapping. All resources in a lib\nshould be contained in the directory structure under its root directory.\nAll definitions a lib makes should be in its associated namespace.\n\n'require loads a lib by loading its root resource. The root resource path\nis derived from the lib name in the following manner:\nConsider a lib named by the symbol 'x.y.z; it has the root directory\n<classpath>/x/y/, and its root resource is <classpath>/x/y/z.clj. The root\nresource should contain code to create the lib's namespace (usually by using\nthe ns macro) and load any additional lib resources.\n\nLibspecs\n\nA libspec is a lib name or a vector containing a lib name followed by\noptions expressed as sequential keywords and arguments.\n\nRecognized options: :as\n:as takes a symbol as its argument and makes that symbol an alias to the\n  lib's namespace in the current namespace.\n\nPrefix Lists\n\nIt's common for Clojure code to depend on several libs whose names have\nthe same prefix. When specifying libs, prefix lists can be used to reduce\nrepetition. A prefix list contains the shared prefix followed by libspecs\nwith the shared prefix removed from the lib names. After removing the\nprefix, the names that remain must not contain any periods.\n\nFlags\n\nA flag is a keyword.\nRecognized flags: :reload, :reload-all, :verbose\n:reload forces loading of all the identified libs even if they are\n  already loaded\n:reload-all implies :reload and also forces loading of all libs that the\n  identified libs directly or indirectly load via require or use\n:verbose triggers printing information about each load, alias, and refer\n\nExample:\n\nThe following would load the libraries clojure.zip and clojure.set\nabbreviated as 's'.\n\n(require '(clojure zip [set :as s]))",
   :var-type "function",
   :line 4821,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([atom newval]),
   :name "reset!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1802",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/reset!",
   :doc
   "Sets the value of atom to newval without regard for the\ncurrent value. Returns newval.",
   :var-type "function",
   :line 1802,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([iref metadata-map]),
   :name "reset-meta!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1832",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/reset-meta!",
   :doc
   "Atomically resets the metadata for a namespace/var/ref/agent/atom",
   :var-type "function",
   :line 1832,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([sym]),
   :name "resolve",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3382",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/resolve",
   :doc "same as (ns-resolve *ns* symbol)",
   :var-type "function",
   :line 3382,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "rest",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L63",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/rest",
   :doc
   "Returns a possibly empty seq of the items after the first. Calls seq on its\nargument.",
   :var-type "function",
   :line 63,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([a new-state & options]),
   :name "restart-agent",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1645",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/restart-agent",
   :doc
   "When an agent is failed, changes the agent state to new-state and\nthen un-fails the agent so that sends are allowed again.  If\na :clear-actions true option is given, any actions queued on the\nagent that were being held while it was failed will be discarded,\notherwise those held actions will proceed.  The new-state must pass\nthe validator if any, or restart will throw an exception and the\nagent will remain failed with its old state and error.  Watchers, if\nany, will NOT be notified of the new state.  Throws an exception if\nthe agent is not failed.",
   :var-type "function",
   :line 1645,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([rs]),
   :name "resultset-seq",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4537",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/resultset-seq",
   :doc
   "Creates and returns a lazy sequence of structmaps corresponding to\nthe rows in the java.sql.ResultSet rs",
   :var-type "function",
   :line 4537,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "reverse",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L802",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/reverse",
   :doc
   "Returns a seq of the items in coll in reverse order. Not lazy.",
   :var-type "function",
   :line 802,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "reversible?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5025",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/reversible?",
   :doc "Returns true if coll implements Reversible",
   :var-type "function",
   :line 5025,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([rev]),
   :name "rseq",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1233",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/rseq",
   :doc
   "Returns, in constant time, a seq of the items in rev (which\ncan be a vector or sorted-map), in reverse order. If rev is empty returns nil",
   :var-type "function",
   :line 1233,
   :file "src/clj/clojure/core.clj"}
  {:arglists
   ([sc test key] [sc start-test start-key end-test end-key]),
   :name "rsubseq",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4042",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/rsubseq",
   :doc
   "sc must be a sorted collection, test(s) one of <, <=, > or\n>=. Returns a reverse seq of those entries with keys ek for\nwhich (test (.. sc comparator (compare ek key)) 0) is true",
   :var-type "function",
   :line 4042,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([protocol x]),
   :name "satisfies?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj#L457",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a249c9221d501998b359097a62d432f7f282d367/src/clj/clojure/core_deftype.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/satisfies?",
   :doc "Returns true if x satisfies the protocol",
   :var-type "function",
   :line 457,
   :file "src/clj/clojure/core_deftype.clj"}
  {:arglists ([x]),
   :name "second",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L84",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/second",
   :doc "Same as (first (next x))",
   :var-type "function",
   :line 84,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([map keyseq]),
   :name "select-keys",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1197",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/select-keys",
   :doc
   "Returns a map containing only those entries in map whose key is in keys",
   :var-type "function",
   :line 1197,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([a f & args]),
   :name "send",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1583",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/send",
   :doc
   "Dispatch an action to an agent. Returns the agent immediately.\nSubsequently, in a thread from a thread pool, the state of the agent\nwill be set to the value of:\n\n(apply action-fn state-of-agent args)",
   :var-type "function",
   :line 1583,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([a f & args]),
   :name "send-off",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1593",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/send-off",
   :doc
   "Dispatch a potentially blocking action to an agent. Returns the\nagent immediately. Subsequently, in a separate thread, the state of\nthe agent will be set to the value of:\n\n(apply action-fn state-of-agent args)",
   :var-type "function",
   :line 1593,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "seq",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L114",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/seq",
   :doc
   "Returns a seq on the collection. If the collection is\nempty, returns nil.  (seq nil) returns nil. seq also works on\nStrings, native Java arrays (of reference types) and any objects\nthat implement Iterable.",
   :var-type "function",
   :line 114,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "seq?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L131",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/seq?",
   :doc "Return true if x implements ISeq",
   :var-type "function",
   :line 131,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([s] [n-or-q s]),
   :name "seque",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4249",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/seque",
   :doc
   "Creates a queued seq on another (presumably lazy) seq s. The queued\nseq will produce a concrete seq in the background, and can get up to\nn items ahead of the consumer. n-or-q can be an integer n buffer\nsize, or an instance of java.util.concurrent BlockingQueue. Note\nthat reading from a seque can block if the reader gets ahead of the\nproducer.",
   :var-type "function",
   :line 4249,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "sequence",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2018",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/sequence",
   :doc
   "Coerces coll to a (possibly empty) sequence, if it is not already\none. Will not force a lazy seq. (sequence nil) yields ()",
   :var-type "function",
   :line 2018,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "sequential?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5010",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/sequential?",
   :doc "Returns true if coll implements Sequential",
   :var-type "function",
   :line 5010,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "set",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3163",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/set",
   :doc "Returns a set of the distinct elements of coll.",
   :var-type "function",
   :line 3163,
   :file "src/clj/clojure/core.clj"}
  {:forms
   [(set! var-symbol expr)
    (set! (. instance-expr instanceFieldName-symbol) expr)
    (set! (. Classname-symbol staticFieldName-symbol) expr)],
   :name "set!",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/set!",
   :doc
   "Used to set thread-local-bound vars, Java object instance\nfields, and Java class static fields.\n\nPlease see http://clojure.org/vars#set",
   :var-type "special form",
   :file nil}
  {:arglists ([a handler-fn]),
   :name "set-error-handler!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1660",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/set-error-handler!",
   :doc
   "Sets the error-handler of agent a to handler-fn.  If an action\nbeing run by the agent throws an exception or doesn't pass the\nvalidator fn, handler-fn will be called with two arguments: the\nagent and the exception.",
   :var-type "function",
   :line 1660,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([a mode-keyword]),
   :name "set-error-mode!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1676",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/set-error-mode!",
   :doc
   "Sets the error-mode of agent a to mode-keyword, which must be\neither :fail or :continue.  If an action being run by the agent\nthrows an exception or doesn't pass the validator fn, an\nerror-handler may be called (see set-error-handler!), after which,\nif the mode is :continue, the agent will continue as if neither the\naction that caused the error nor the error itself ever happened.\n\nIf the mode is :fail, the agent will become failed and will stop\naccepting new 'send' and 'send-off' actions, and any previously\nqueued actions will be held until a 'restart-agent'.  Deref will\nstill work, returning the state of the agent before the error.",
   :var-type "function",
   :line 1676,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([iref validator-fn]),
   :name "set-validator!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1808",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/set-validator!",
   :doc
   "Sets the validator-fn for a var/ref/agent/atom. validator-fn must be nil or a\nside-effect-free fn of one argument, which will be passed the intended\nnew state on any state change. If the new state is unacceptable, the\nvalidator-fn should return false or throw an exception. If the current state (root\nvalue if var) is not acceptable to the new validator, an exception\nwill be thrown and the validator will not be changed.",
   :var-type "function",
   :line 1808,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "set?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4988",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/set?",
   :doc "Returns true if x implements IPersistentSet",
   :var-type "function",
   :line 4988,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "short",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2690",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/short",
   :doc "Coerce to short",
   :var-type "function",
   :line 2690,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([size-or-seq] [size init-val-or-seq]),
   :name "short-array",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4168",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/short-array",
   :doc "Creates an array of shorts",
   :var-type "function",
   :line 4168,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([xs]),
   :name "shorts",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4222",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/shorts",
   :doc "Casts to shorts[]",
   :var-type "function",
   :line 4222,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "shuffle",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5620",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/shuffle",
   :doc "Return a random permutation of coll",
   :var-type "function",
   :line 5620,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([]),
   :name "shutdown-agents",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1716",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/shutdown-agents",
   :doc
   "Initiates a shutdown of the thread pools that back the agent\nsystem. Running actions will complete, but no new actions will be\naccepted",
   :var-type "function",
   :line 1716,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f & opts]),
   :name "slurp",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5375",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/slurp",
   :doc
   "Reads the file named by f using the encoding enc into a string\nand returns it.",
   :var-type "function",
   :line 5375,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([pred coll]),
   :name "some",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2045",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/some",
   :doc
   "Returns the first logical true value of (pred x) for any x in coll,\nelse nil.  One common idiom is to use a set as pred, for example\nthis will return :fred if :fred is in the sequence, otherwise nil:\n(some #{:fred} coll)",
   :var-type "function",
   :line 2045,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll] [comp coll]),
   :name "sort",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2329",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/sort",
   :doc
   "Returns a sorted sequence of the items in coll. If no comparator is\nsupplied, uses compare. comparator must\nimplement java.util.Comparator.",
   :var-type "function",
   :line 2329,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([keyfn coll] [keyfn comp coll]),
   :name "sort-by",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2343",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/sort-by",
   :doc
   "Returns a sorted sequence of the items in coll, where the sort\norder is determined by comparing (keyfn item).  If no comparator is\nsupplied, uses compare. comparator must\nimplement java.util.Comparator.",
   :var-type "function",
   :line 2343,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& keyvals]),
   :name "sorted-map",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L336",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/sorted-map",
   :doc
   "keyval => key val\nReturns a new sorted map with supplied mappings.",
   :var-type "function",
   :line 336,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([comparator & keyvals]),
   :name "sorted-map-by",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L343",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/sorted-map-by",
   :doc
   "keyval => key val\nReturns a new sorted map with supplied mappings, using the supplied comparator.",
   :var-type "function",
   :line 343,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& keys]),
   :name "sorted-set",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L350",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/sorted-set",
   :doc "Returns a new sorted set with supplied keys.",
   :var-type "function",
   :line 350,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([comparator & keys]),
   :name "sorted-set-by",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L356",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/sorted-set-by",
   :doc
   "Returns a new sorted set with supplied keys, using the supplied comparator.",
   :var-type "function",
   :line 356,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "sorted?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5015",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/sorted?",
   :doc "Returns true if coll implements Sorted",
   :var-type "function",
   :line 5015,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "special-form-anchor",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3850",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/special-form-anchor",
   :doc
   "Returns the anchor tag on http://clojure.org/special_forms for the\nspecial form x, or nil",
   :var-type "function",
   :line 3850,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([s]),
   :name "special-symbol?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3929",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/special-symbol?",
   :doc "Returns true if s names a special form",
   :var-type "function",
   :line 3929,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f content & options]),
   :name "spit",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5390",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/spit",
   :doc
   "Opposite of slurp.  Opens f with writer, writes content, then\ncloses f. Options passed to clojure.java.io/writer.",
   :var-type "function",
   :line 5390,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n coll]),
   :name "split-at",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2218",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/split-at",
   :doc "Returns a vector of [(take n coll) (drop n coll)]",
   :var-type "function",
   :line 2218,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([pred coll]),
   :name "split-with",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2224",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/split-with",
   :doc
   "Returns a vector of [(take-while pred coll) (drop-while pred coll)]",
   :var-type "function",
   :line 2224,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([] [x] [x & ys]),
   :name "str",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L449",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/str",
   :doc
   "With no args, returns the empty string. With one arg x, returns\nx.toString().  (str nil) returns the empty string. With more than\none arg, returns the concatenation of the str values of the args.",
   :var-type "function",
   :line 449,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "string?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L143",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/string?",
   :doc "Return true if x is a String",
   :var-type "function",
   :line 143,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([s & vals]),
   :name "struct",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3130",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/struct",
   :doc
   "Returns a new structmap instance with the keys of the\nstructure-basis. vals must be supplied for basis keys in order -\nwhere values are not supplied they will default to nil.",
   :var-type "function",
   :line 3130,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([s & inits]),
   :name "struct-map",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3121",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/struct-map",
   :doc
   "Returns a new structmap instance with the keys of the\nstructure-basis. keyvals may contain all, some or none of the basis\nkeys - where values are not supplied they will default to nil.\nkeyvals can also contain keys not in the basis.",
   :var-type "function",
   :line 3121,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([s start] [s start end]),
   :name "subs",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3940",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/subs",
   :doc
   "Returns the substring of s beginning at start inclusive, and ending\nat end (defaults to length of string), exclusive.",
   :var-type "function",
   :line 3940,
   :file "src/clj/clojure/core.clj"}
  {:arglists
   ([sc test key] [sc start-test start-key end-test end-key]),
   :name "subseq",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4026",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/subseq",
   :doc
   "sc must be a sorted collection, test(s) one of <, <=, > or\n>=. Returns a seq of those entries with keys ek for\nwhich (test (.. sc comparator (compare ek key)) 0) is true",
   :var-type "function",
   :line 4026,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([v start] [v start end]),
   :name "subvec",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2899",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/subvec",
   :doc
   "Returns a persistent vector of the items in vector from\nstart (inclusive) to end (exclusive).  If end is not supplied,\ndefaults to (count vector). This operation is O(1) and very fast, as\nthe resulting vector shares structure with the original and no\ntrimming is done.",
   :var-type "function",
   :line 2899,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([class]),
   :name "supers",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4390",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/supers",
   :doc
   "Returns the immediate and indirect superclasses and interfaces of c, if any",
   :var-type "function",
   :line 4390,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([atom f] [atom f x] [atom f x y] [atom f x y & args]),
   :name "swap!",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1784",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/swap!",
   :doc
   "Atomically swaps the value of atom to be:\n(apply f current-value-of-atom args). Note that f may be called\nmultiple times, and thus should be free of side effects.  Returns\nthe value that was swapped in.",
   :var-type "function",
   :line 1784,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([name] [ns name]),
   :name "symbol",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L476",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/symbol",
   :doc "Returns a Symbol with the given namespace and name.",
   :var-type "function",
   :line 476,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "symbol?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L466",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/symbol?",
   :doc "Return true if x is a Symbol",
   :var-type "function",
   :line 466,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([flags-ignored-for-now & body]),
   :name "sync",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1906",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/sync",
   :doc
   "transaction-flags => TBD, pass nil for now\n\nRuns the exprs (in an implicit do) in a transaction that encompasses\nexprs and any nested calls.  Starts a transaction if none is already\nrunning on this thread. Any uncaught exception will abort the\ntransaction and flow out of sync. The exprs may be run more than\nonce, but any effects on Refs will be atomic.",
   :var-type "macro",
   :line 1906,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "syntax-symbol-anchor",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3858",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/syntax-symbol-anchor",
   :doc
   "Returns the anchor tag on http://clojure.org/special_forms for the\nspecial form that uses syntax symbol x, or nil",
   :var-type "function",
   :line 3858,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n coll]),
   :name "take",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2152",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/take",
   :doc
   "Returns a lazy sequence of the first n items in coll, or all items if\nthere are fewer than n.",
   :var-type "function",
   :line 2152,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n coll]),
   :name "take-last",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2189",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/take-last",
   :doc
   "Returns a seq of the last n items in coll.  Depending on the type\nof coll may be no better than linear time.  For vectors, see also subvec.",
   :var-type "function",
   :line 2189,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([n coll]),
   :name "take-nth",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3320",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/take-nth",
   :doc "Returns a lazy seq of every nth item in coll.",
   :var-type "function",
   :line 3320,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([pred coll]),
   :name "take-while",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2162",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/take-while",
   :doc
   "Returns a lazy sequence of successive items from coll while\n(pred item) returns true. pred must be free of side-effects.",
   :var-type "function",
   :line 2162,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([v]),
   :name "test",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3735",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/test",
   :doc
   "test [v] finds fn at key :test in var metadata and calls it,\npresuming failure will throw exception",
   :var-type "function",
   :line 3735,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "the-ns",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3200",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/the-ns",
   :doc
   "If passed a namespace, returns it. Else, when passed a symbol,\nreturns the namespace named by it, throwing an exception if not\nfound.",
   :var-type "function",
   :line 3200,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& vars]),
   :name "thread-bound?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4360",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/thread-bound?",
   :doc
   "Returns true if all of the vars provided as arguments have thread-local bindings.\nImplies that set!'ing the provided vars will succeed.  Returns true if no vars are provided.",
   :var-type "function",
   :line 4360,
   :file "src/clj/clojure/core.clj"}
  {:forms [(throw expr)],
   :name "throw",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/throw",
   :doc
   "The expr is evaluated and thrown, therefore it should\nyield an instance of some derivee of Throwable.\n\nPlease see http://clojure.org/special_forms#throw",
   :var-type "special form",
   :file nil}
  {:arglists ([expr]),
   :name "time",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2959",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/time",
   :doc
   "Evaluates expr and prints the time it took.  Returns the value of\nexpr.",
   :var-type "macro",
   :line 2959,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "to-array",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L295",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/to-array",
   :doc
   "Returns an array of Objects containing the contents of coll, which\ncan be any Collection.  Maps to java.util.Collection.toArray().",
   :var-type "function",
   :line 295,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "to-array-2d",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3077",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/to-array-2d",
   :doc
   "Returns a (potentially-ragged) 2-dimensional array of Objects\ncontaining the contents of coll, which can be any Collection of any\nCollection.",
   :var-type "function",
   :line 3077,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([f] [f & args]),
   :name "trampoline",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5050",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/trampoline",
   :doc
   "trampoline can be used to convert algorithms requiring mutual\nrecursion without stack consumption. Calls f with supplied args, if\nany. If f returns a fn, calls that fn with no arguments, and\ncontinues to repeat, until the return value is not a fn, then\nreturns that non-fn value. Note that if you want to return a fn as a\nfinal value, you must wrap it in some data structure and unpack it\nafter trampoline returns.",
   :var-type "function",
   :line 5050,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "transient",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2537",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/transient",
   :doc
   "Alpha - subject to change.\nReturns a new, transient version of the collection, in constant time.",
   :var-type "function",
   :line 2537,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([branch? children root]),
   :name "tree-seq",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3895",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/tree-seq",
   :doc
   "Returns a lazy sequence of the nodes in a tree, via a depth-first walk.\n branch? must be a fn of one arg that returns true if passed a node\n that can have children (but may not).  children must be a fn of one\n arg that returns a sequence of the children. Will only be called on\n nodes for which branch? returns true. Root is the root node of the\ntree.",
   :var-type "function",
   :line 3895,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "true?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L437",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/true?",
   :doc "Returns true if x is the value true, false otherwise.",
   :var-type "function",
   :line 437,
   :file "src/clj/clojure/core.clj"}
  {:forms [(try expr* catch-clause* finally-clause?)],
   :name "try",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/try",
   :doc
   "catch-clause => (catch classname name expr*)\nfinally-clause => (finally expr*)\n\nCatches and handles Java exceptions.\n\nPlease see http://clojure.org/special_forms#try",
   :var-type "special form",
   :file nil}
  {:arglists ([x]),
   :name "type",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2656",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/type",
   :doc "Returns the :type metadata of x, or its Class if none",
   :var-type "function",
   :line 2656,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x y]),
   :name "unchecked-add",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L955",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/unchecked-add",
   :doc
   "Returns the sum of x and y, both int or long.\nNote - uses a primitive operator subject to overflow.",
   :var-type "function",
   :line 955,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "unchecked-dec",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L941",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/unchecked-dec",
   :doc
   "Returns a number one less than x, an int or long.\nNote - uses a primitive operator subject to overflow.",
   :var-type "function",
   :line 941,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x y]),
   :name "unchecked-divide",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L976",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/unchecked-divide",
   :doc
   "Returns the division of x by y, both int or long.\nNote - uses a primitive operator subject to truncation.",
   :var-type "function",
   :line 976,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "unchecked-inc",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L934",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/unchecked-inc",
   :doc
   "Returns a number one greater than x, an int or long.\nNote - uses a primitive operator subject to overflow.",
   :var-type "function",
   :line 934,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x y]),
   :name "unchecked-multiply",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L969",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/unchecked-multiply",
   :doc
   "Returns the product of x and y, both int or long.\nNote - uses a primitive operator subject to overflow.",
   :var-type "function",
   :line 969,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "unchecked-negate",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L948",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/unchecked-negate",
   :doc
   "Returns the negation of x, an int or long.\nNote - uses a primitive operator subject to overflow.",
   :var-type "function",
   :line 948,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x y]),
   :name "unchecked-remainder",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L983",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/unchecked-remainder",
   :doc
   "Returns the remainder of division of x by y, both int or long.\nNote - uses a primitive operator subject to truncation.",
   :var-type "function",
   :line 983,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x y]),
   :name "unchecked-subtract",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L962",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/unchecked-subtract",
   :doc
   "Returns the difference of x and y, both int or long.\nNote - uses a primitive operator subject to overflow.",
   :var-type "function",
   :line 962,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([tag parent] [h tag parent]),
   :name "underive",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4500",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/underive",
   :doc
   "Removes a parent/child relationship between parent and\ntag. h must be a hierarchy obtained from make-hierarchy, if not\nsupplied defaults to, and modifies, the global hierarchy.",
   :var-type "function",
   :line 4500,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([m [k & ks] f & args]),
   :name "update-in",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4959",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/update-in",
   :doc
   "'Updates' a value in a nested associative structure, where ks is a\nsequence of keys and f is a function that will take the old value\nand any supplied args and return the new value, and returns a new\nnested structure.  If any levels do not exist, hash-maps will be\ncreated.",
   :var-type "function",
   :line 4959,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([proxy mappings]),
   :name "update-proxy",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj#L281",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/2ac93197e356af3c826ca895b5a538ad08c5715a/src/clj/clojure/core_proxy.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/update-proxy",
   :doc
   "Takes a proxy instance and a map of strings (which must\ncorrespond to methods of the proxy superclass/superinterfaces) to\nfns (which must take arguments matching the corresponding method,\nplus an additional (explicit) first arg corresponding to this, and\nupdates (via assoc) the proxy's fn map. nil can be passed instead of\na fn, in which case the corresponding method will revert to the\ndefault behavior. Note that this function can be used to update the\nbehavior of an existing instance without changing its identity.",
   :var-type "function",
   :line 281,
   :file "src/clj/clojure/core_proxy.clj"}
  {:arglists ([& args]),
   :name "use",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4883",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/use",
   :doc
   "Like 'require, but also refers to each lib's namespace using\nclojure.core/refer. Use :use in the ns macro in preference to calling\nthis directly.\n\n'use accepts additional options in libspecs: :exclude, :only, :rename.\nThe arguments and semantics for :exclude, :only, and :rename are the same\nas those documented for clojure.core/refer.",
   :var-type "function",
   :line 4883,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([e]),
   :name "val",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1227",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/val",
   :doc "Returns the value in the map entry.",
   :var-type "function",
   :line 1227,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([map]),
   :name "vals",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1216",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/vals",
   :doc "Returns a sequence of the map's values.",
   :var-type "function",
   :line 1216,
   :file "src/clj/clojure/core.clj"}
  {:forms [#'symbol],
   :name "var",
   :namespace "clojure.core",
   :source-url nil,
   :added "1.0",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/var",
   :doc
   "The symbol must resolve to a var, and the Var object\nitself (not its value) is returned. The reader macro #'x\nexpands to (var x).\n\nPlease see http://clojure.org/special_forms#var",
   :var-type "special form",
   :file nil}
  {:arglists ([x]),
   :name "var-get",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3343",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/var-get",
   :doc "Gets the value in the var object",
   :var-type "function",
   :line 3343,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x val]),
   :name "var-set",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3348",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/var-set",
   :doc
   "Sets the value in the var object to val. The var must be\nthread-locally bound.",
   :var-type "function",
   :line 3348,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([v]),
   :name "var?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3935",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/var?",
   :doc "Returns true if v is of type clojure.lang.Var",
   :var-type "function",
   :line 3935,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([obj f & args]),
   :name "vary-meta",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L550",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/vary-meta",
   :doc
   "Returns an object of the same type and value as obj, with\n(apply f (meta obj) args) as its metadata.",
   :var-type "function",
   :line 550,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([coll]),
   :name "vec",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L313",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/vec",
   :doc "Creates a new vector containing the contents of coll.",
   :var-type "function",
   :line 313,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([] [a] [a b] [a b c] [a b c d] [a b c d & args]),
   :name "vector",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L302",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/vector",
   :doc "Creates a new vector containing the args.",
   :var-type "function",
   :line 302,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([t]),
   :name "vector-of",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/4bec81db4ee4e9e4227a66bb1a04ba06e95ea9b6/src/clj/clojure/gvec.clj#L452",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/4bec81db4ee4e9e4227a66bb1a04ba06e95ea9b6/src/clj/clojure/gvec.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/vector-of",
   :doc
   "Creates a new vector of a single primitive type t, where t is one\nof :int :long :float :double :byte :short :char or :boolean. The\nresulting vector complies with the interface of vectors in general,\nbut stores the values unboxed internally.",
   :var-type "function",
   :line 452,
   :file "src/clj/clojure/gvec.clj"}
  {:arglists ([x]),
   :name "vector?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L155",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/vector?",
   :doc "Return true if x implements IPersistentVector",
   :var-type "function",
   :line 155,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([test & body]),
   :name "when",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L419",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/when",
   :doc
   "Evaluates test. If logical true, evaluates body in an implicit do.",
   :var-type "macro",
   :line 419,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([bindings & body]),
   :name "when-first",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3558",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/when-first",
   :doc
   "bindings => x xs\n\nSame as (when (seq xs) (let [x (first xs)] body))",
   :var-type "macro",
   :line 3558,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([bindings & body]),
   :name "when-let",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1422",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/when-let",
   :doc
   "bindings => binding-form test\n\nWhen test is true, evaluates body with binding-form bound to the value of test",
   :var-type "macro",
   :line 1422,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([test & body]),
   :name "when-not",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L425",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/when-not",
   :doc
   "Evaluates test. If logical false, evaluates body in an implicit do.",
   :var-type "macro",
   :line 425,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([test & body]),
   :name "while",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L5082",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/while",
   :doc
   "Repeatedly executes body while test expression is true. Presumes\nsome side-effect will cause test to become false/nil. Returns nil",
   :var-type "macro",
   :line 5082,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([binding-map & body]),
   :name "with-bindings",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1506",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/with-bindings",
   :doc
   "Takes a map of Var/value pairs. Installs for the given Vars the associated\nvalues as thread-local bindings. The executes body. Pops the installed\nbindings after body was evaluated. Returns the value of body.",
   :var-type "macro",
   :line 1506,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([binding-map f & args]),
   :name "with-bindings*",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L1494",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/with-bindings*",
   :doc
   "Takes a map of Var/value pairs. Installs for the given Vars the associated\nvalues as thread-local bindings. Then calls f with the supplied arguments.\nPops the installed bindings after f returned. Returns whatever f returns.",
   :var-type "function",
   :line 1494,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([s & body]),
   :name "with-in-str",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3685",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/with-in-str",
   :doc
   "Evaluates body in a context in which *in* is bound to a fresh\nStringReader initialized with the string s.",
   :var-type "macro",
   :line 3685,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([name-vals-vec & body]),
   :name "with-local-vars",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3354",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/with-local-vars",
   :doc
   "varbinding=> symbol init-expr\n\nExecutes the exprs in a context in which the symbols are bound to\nvars with per-thread bindings to the init-exprs.  The symbols refer\nto the var objects themselves, and must be accessed with var-get and\nvar-set",
   :var-type "macro",
   :line 3354,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([obj m]),
   :name "with-meta",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L186",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/with-meta",
   :doc
   "Returns an object of the same type and value as obj, with\nmap m as its metadata.",
   :var-type "function",
   :line 186,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([bindings & body]),
   :name "with-open",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2911",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/with-open",
   :doc
   "bindings => [name init ...]\n\nEvaluates body in a try expression with names bound to the values\nof the inits, and a finally clause that calls (.close name) on each\nname in reverse order.",
   :var-type "macro",
   :line 2911,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([& body]),
   :name "with-out-str",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3674",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/with-out-str",
   :doc
   "Evaluates exprs in a context in which *out* is bound to a fresh\nStringWriter.  Returns the string created by any nested printing\ncalls.",
   :var-type "macro",
   :line 3674,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([precision & exprs]),
   :name "with-precision",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L4003",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/with-precision",
   :doc
   "Sets the precision and rounding mode to be used for BigDecimal operations.\n\nUsage: (with-precision 10 (/ 1M 3))\nor:    (with-precision 10 :rounding HALF_DOWN (/ 1M 3))\n\nThe rounding mode is one of CEILING, FLOOR, HALF_UP, HALF_DOWN,\nHALF_EVEN, UP, DOWN and UNNECESSARY; it defaults to HALF_UP.",
   :var-type "macro",
   :line 4003,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([root]),
   :name "xml-seq",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L3920",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/xml-seq",
   :doc "A tree seq on the xml elements as per xml/parse",
   :var-type "function",
   :line 3920,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "zero?",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L718",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/zero?",
   :doc "Returns true if num is zero, else false",
   :var-type "function",
   :line 718,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([keys vals]),
   :name "zipmap",
   :namespace "clojure.core",
   :source-url
   "https://github.com/clojure/clojure/blob/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj#L2296",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/f86db9cc68773dd3e4a166c1ff7b81e4a98aa602/src/clj/clojure/core.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core/zipmap",
   :doc
   "Returns a map with the keys mapped to the corresponding vals.",
   :var-type "function",
   :line 2296,
   :file "src/clj/clojure/core.clj"}
  {:arglists ([x]),
   :name "inspect",
   :namespace "clojure.inspector",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/inspector.clj#L150",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/inspector.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.inspector-api.html#clojure.inspector/inspect",
   :doc "creates a graphical (Swing) inspector on the supplied object",
   :var-type "function",
   :line 150,
   :file "src/clj/clojure/inspector.clj"}
  {:arglists ([data]),
   :name "inspect-table",
   :namespace "clojure.inspector",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/inspector.clj#L96",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/inspector.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.inspector-api.html#clojure.inspector/inspect-table",
   :doc
   "creates a graphical (Swing) inspector on the supplied regular\ndata, which must be a sequential data structure of data structures\nof equal length",
   :var-type "function",
   :line 96,
   :file "src/clj/clojure/inspector.clj"}
  {:arglists ([data]),
   :name "inspect-tree",
   :namespace "clojure.inspector",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/inspector.clj#L87",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/inspector.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.inspector-api.html#clojure.inspector/inspect-tree",
   :doc
   "creates a graphical (Swing) inspector on the supplied hierarchical data",
   :var-type "function",
   :line 87,
   :file "src/clj/clojure/inspector.clj"}
  {:arglists ([url]),
   :name "browse-url",
   :namespace "clojure.java.browse",
   :source-url
   "https://github.com/clojure/clojure/blob/fbe0183713b92b2f96a68e2a0d0d654bb7ce93ff/src/clj/clojure/java/browse.clj#L46",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fbe0183713b92b2f96a68e2a0d0d654bb7ce93ff/src/clj/clojure/java/browse.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.browse-api.html#clojure.java.browse/browse-url",
   :doc "Open url in a browser",
   :var-type "function",
   :line 46,
   :file "src/clj/clojure/java/browse.clj"}
  {:arglists ([x]),
   :name "as-relative-path",
   :namespace "clojure.java.io",
   :source-url
   "https://github.com/clojure/clojure/blob/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj#L385",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/as-relative-path",
   :doc
   "Take an as-file-able thing and return a string if it is\na relative path, else IllegalArgumentException.",
   :var-type "function",
   :line 385,
   :file "src/clj/clojure/java/io.clj"}
  {:arglists ([input output & opts]),
   :name "copy",
   :namespace "clojure.java.io",
   :source-url
   "https://github.com/clojure/clojure/blob/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj#L368",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/copy",
   :doc
   "Copies input to output.  Returns nil or throws IOException.\nInput may be an InputStream, Reader, File, byte[], or String.\nOutput may be an OutputStream, Writer, or File.\n\nOptions are key/value pairs and may be one of\n\n  :buffer-size  buffer size to use, default is 1024.\n  :encoding     encoding to use if converting between\n                byte and char streams.   \n\nDoes not close any streams except those it opens itself \n(on a File).",
   :var-type "function",
   :line 368,
   :file "src/clj/clojure/java/io.clj"}
  {:arglists ([f & [silently]]),
   :name "delete-file",
   :namespace "clojure.java.io",
   :source-url
   "https://github.com/clojure/clojure/blob/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj#L407",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/delete-file",
   :doc
   "Delete file f. Raise an exception if it fails unless silently is true.",
   :var-type "function",
   :line 407,
   :file "src/clj/clojure/java/io.clj"}
  {:arglists ([arg] [parent child] [parent child & more]),
   :name "file",
   :namespace "clojure.java.io",
   :source-url
   "https://github.com/clojure/clojure/blob/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj#L395",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/file",
   :doc
   "Returns a java.io.File, passing each arg to as-file.  Multiple-arg\nversions treat the first argument as parent and subsequent args as\nchildren relative to the parent.",
   :var-type "function",
   :line 395,
   :file "src/clj/clojure/java/io.clj"}
  {:arglists ([x & opts]),
   :name "input-stream",
   :namespace "clojure.java.io",
   :source-url
   "https://github.com/clojure/clojure/blob/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj#L115",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/input-stream",
   :doc
   "Attempts to coerce its argument into an open java.io.InputStream.\nDefault implementations always return a java.io.BufferedInputStream.\n\nDefault implementations are defined for OutputStream, File, URI, URL,\nSocket, byte array, and String arguments.\n\nIf the argument is a String, it tries to resolve it first as a URI, then\nas a local file name.  URIs with a 'file' protocol are converted to\nlocal file names.\n\nShould be used inside with-open to ensure the InputStream is properly\nclosed.",
   :var-type "function",
   :line 115,
   :file "src/clj/clojure/java/io.clj"}
  {:arglists ([f & more]),
   :name "make-parents",
   :namespace "clojure.java.io",
   :source-url
   "https://github.com/clojure/clojure/blob/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj#L415",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/make-parents",
   :doc
   "Given the same arg(s) as for file, creates all parent directories of\nthe file they represent.",
   :var-type "function",
   :line 415,
   :file "src/clj/clojure/java/io.clj"}
  {:arglists ([x & opts]),
   :name "output-stream",
   :namespace "clojure.java.io",
   :source-url
   "https://github.com/clojure/clojure/blob/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj#L132",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/output-stream",
   :doc
   "Attempts to coerce its argument into an open java.io.OutputStream.\nDefault implementations always return a java.io.BufferedOutputStream.\n\nDefault implementations are defined for OutputStream, File, URI, URL,\nSocket, and String arguments.\n\nIf the argument is a String, it tries to resolve it first as a URI, then\nas a local file name.  URIs with a 'file' protocol are converted to\nlocal file names.\n\nShould be used inside with-open to ensure the OutputStream is\nproperly closed.",
   :var-type "function",
   :line 132,
   :file "src/clj/clojure/java/io.clj"}
  {:arglists ([x & opts]),
   :name "reader",
   :namespace "clojure.java.io",
   :source-url
   "https://github.com/clojure/clojure/blob/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj#L80",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/reader",
   :doc
   "Attempts to coerce its argument into an open java.io.Reader.\nDefault implementations always return a java.io.BufferedReader.\n\nDefault implementations are provided for Reader, BufferedReader,\nInputStream, File, URI, URL, Socket, byte arrays, character arrays,\nand String.\n\nIf argument is a String, it tries to resolve it first as a URI, then\nas a local file name.  URIs with a 'file' protocol are converted to\nlocal file names.\n\nShould be used inside with-open to ensure the Reader is properly\nclosed.",
   :var-type "function",
   :line 80,
   :file "src/clj/clojure/java/io.clj"}
  {:arglists ([n] [n loader]),
   :name "resource",
   :namespace "clojure.java.io",
   :source-url
   "https://github.com/clojure/clojure/blob/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj#L422",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/resource",
   :doc
   "Returns the URL for a named resource. Use the context class loader\nif no loader is specified.",
   :var-type "function",
   :line 422,
   :file "src/clj/clojure/java/io.clj"}
  {:arglists ([x & opts]),
   :name "writer",
   :namespace "clojure.java.io",
   :source-url
   "https://github.com/clojure/clojure/blob/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj#L98",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/writer",
   :doc
   "Attempts to coerce its argument into an open java.io.Writer.\nDefault implementations always return a java.io.BufferedWriter.\n\nDefault implementations are provided for Writer, BufferedWriter,\nOutputStream, File, URI, URL, Socket, and String.\n\nIf the argument is a String, it tries to resolve it first as a URI, then\nas a local file name.  URIs with a 'file' protocol are converted to\nlocal file names.\n\nShould be used inside with-open to ensure the Writer is properly\nclosed.",
   :var-type "function",
   :line 98,
   :file "src/clj/clojure/java/io.clj"}
  {:name "Coercions",
   :namespace "clojure.java.io",
   :source-url
   "https://github.com/clojure/clojure/blob/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj#L34",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/Coercions",
   :doc "Coerce between various 'resource-namish' things.",
   :var-type "protocol",
   :line 34,
   :file "src/clj/clojure/java/io.clj"}
  {:name "IOFactory",
   :namespace "clojure.java.io",
   :source-url
   "https://github.com/clojure/clojure/blob/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj#L63",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/3a3374f714e5a755b7de2a761f37696f07a74e80/src/clj/clojure/java/io.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/IOFactory",
   :doc
   "Factory functions that create ready-to-use, buffered versions of\nthe various Java I/O stream types, on top of anything that can\nbe unequivocally converted to the requested kind of stream.\n\nCommon options include\n\n  :append    true to open stream in append mode\n  :encoding  string name of encoding to use, e.g. \"UTF-8\".\n\nCallers should generally prefer the higher level API provided by\nreader, writer, input-stream, and output-stream.",
   :var-type "protocol",
   :line 63,
   :file "src/clj/clojure/java/io.clj"}
  {:arglists ([x]),
   :name "as-file",
   :namespace "clojure.java.io",
   :source-url nil,
   :added "1.2",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/as-file",
   :doc "Coerce argument to a file.",
   :var-type "function",
   :file nil}
  {:arglists ([x]),
   :name "as-url",
   :namespace "clojure.java.io",
   :source-url nil,
   :added "1.2",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/as-url",
   :doc "Coerce argument to a URL.",
   :var-type "function",
   :file nil}
  {:arglists ([x opts]),
   :name "make-input-stream",
   :namespace "clojure.java.io",
   :source-url nil,
   :added "1.2",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/make-input-stream",
   :doc "Creates a BufferedInputStream. See also IOFactory docs.",
   :var-type "function",
   :file nil}
  {:arglists ([x opts]),
   :name "make-output-stream",
   :namespace "clojure.java.io",
   :source-url nil,
   :added "1.2",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/make-output-stream",
   :doc "Creates a BufferedOutputStream. See also IOFactory docs.",
   :var-type "function",
   :file nil}
  {:arglists ([x opts]),
   :name "make-reader",
   :namespace "clojure.java.io",
   :source-url nil,
   :added "1.2",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/make-reader",
   :doc "Creates a BufferedReader. See also IOFactory docs.",
   :var-type "function",
   :file nil}
  {:arglists ([x opts]),
   :name "make-writer",
   :namespace "clojure.java.io",
   :source-url nil,
   :added "1.2",
   :raw-source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.io-api.html#clojure.java.io/make-writer",
   :doc "Creates a BufferedWriter. See also IOFactory docs.",
   :var-type "function",
   :file nil}
  {:arglists ([path]),
   :name "add-local-javadoc",
   :namespace "clojure.java.javadoc",
   :source-url
   "https://github.com/clojure/clojure/blob/89ed54ec8850bb3012c89c91d076a34837ca737e/src/clj/clojure/java/javadoc.clj#L38",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/89ed54ec8850bb3012c89c91d076a34837ca737e/src/clj/clojure/java/javadoc.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.javadoc-api.html#clojure.java.javadoc/add-local-javadoc",
   :doc "Adds to the list of local Javadoc paths.",
   :var-type "function",
   :line 38,
   :file "src/clj/clojure/java/javadoc.clj"}
  {:arglists ([package-prefix url]),
   :name "add-remote-javadoc",
   :namespace "clojure.java.javadoc",
   :source-url
   "https://github.com/clojure/clojure/blob/89ed54ec8850bb3012c89c91d076a34837ca737e/src/clj/clojure/java/javadoc.clj#L44",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/89ed54ec8850bb3012c89c91d076a34837ca737e/src/clj/clojure/java/javadoc.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.javadoc-api.html#clojure.java.javadoc/add-remote-javadoc",
   :doc
   "Adds to the list of remote Javadoc URLs.  package-prefix is the\nbeginning of the package name that has docs at this URL.",
   :var-type "function",
   :line 44,
   :file "src/clj/clojure/java/javadoc.clj"}
  {:arglists ([class-or-object]),
   :name "javadoc",
   :namespace "clojure.java.javadoc",
   :source-url
   "https://github.com/clojure/clojure/blob/89ed54ec8850bb3012c89c91d076a34837ca737e/src/clj/clojure/java/javadoc.clj#L72",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/89ed54ec8850bb3012c89c91d076a34837ca737e/src/clj/clojure/java/javadoc.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.javadoc-api.html#clojure.java.javadoc/javadoc",
   :doc
   "Opens a browser window displaying the javadoc for the argument.\nTries *local-javadocs* first, then *remote-javadocs*.",
   :var-type "function",
   :line 72,
   :file "src/clj/clojure/java/javadoc.clj"}
  {:arglists ([& args]),
   :name "sh",
   :namespace "clojure.java.shell",
   :source-url
   "https://github.com/clojure/clojure/blob/a2c95ef1bf6e34a455b469ac9ff18ddff7e9cef7/src/clj/clojure/java/shell.clj#L79",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a2c95ef1bf6e34a455b469ac9ff18ddff7e9cef7/src/clj/clojure/java/shell.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.shell-api.html#clojure.java.shell/sh",
   :doc
   "Passes the given strings to Runtime.exec() to launch a sub-process.\n\nOptions are\n\n:in      may be given followed by a String or byte array specifying input\n         to be fed to the sub-process's stdin.\n:in-enc  option may be given followed by a String, used as a character\n         encoding name (for example \"UTF-8\" or \"ISO-8859-1\") to\n         convert the input string specified by the :in option to the\n         sub-process's stdin.  Defaults to UTF-8.\n         If the :in option provides a byte array, then the bytes are passed\n         unencoded, and this option is ignored.\n:out-enc option may be given followed by :bytes or a String. If a\n         String is given, it will be used as a character encoding\n         name (for example \"UTF-8\" or \"ISO-8859-1\") to convert\n         the sub-process's stdout to a String which is returned.\n         If :bytes is given, the sub-process's stdout will be stored\n         in a byte array and returned.  Defaults to UTF-8.\n:env     override the process env with a map (or the underlying Java\n         String[] if you are a masochist).\n:dir     override the process dir with a String or java.io.File.\n\nYou can bind :env or :dir for multiple operations using with-sh-env\nand with-sh-dir.\n\nsh returns a map of\n  :exit => sub-process's exit code\n  :out  => sub-process's stdout (as byte[] or String)\n  :err  => sub-process's stderr (String via platform default encoding)",
   :var-type "function",
   :line 79,
   :file "src/clj/clojure/java/shell.clj"}
  {:arglists ([dir & forms]),
   :name "with-sh-dir",
   :namespace "clojure.java.shell",
   :source-url
   "https://github.com/clojure/clojure/blob/a2c95ef1bf6e34a455b469ac9ff18ddff7e9cef7/src/clj/clojure/java/shell.clj#L21",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a2c95ef1bf6e34a455b469ac9ff18ddff7e9cef7/src/clj/clojure/java/shell.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.shell-api.html#clojure.java.shell/with-sh-dir",
   :doc "Sets the directory for use with sh, see sh for details.",
   :var-type "macro",
   :line 21,
   :file "src/clj/clojure/java/shell.clj"}
  {:arglists ([env & forms]),
   :name "with-sh-env",
   :namespace "clojure.java.shell",
   :source-url
   "https://github.com/clojure/clojure/blob/a2c95ef1bf6e34a455b469ac9ff18ddff7e9cef7/src/clj/clojure/java/shell.clj#L28",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a2c95ef1bf6e34a455b469ac9ff18ddff7e9cef7/src/clj/clojure/java/shell.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.java.shell-api.html#clojure.java.shell/with-sh-env",
   :doc "Sets the environment for use with sh, see sh for details.",
   :var-type "macro",
   :line 28,
   :file "src/clj/clojure/java/shell.clj"}
  {:arglists ([path]),
   :name "load-script",
   :namespace "clojure.main",
   :source-url
   "https://github.com/clojure/clojure/blob/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj#L214",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.main-api.html#clojure.main/load-script",
   :doc
   "Loads Clojure source from a file or resource given its path. Paths\nbeginning with @ or @/ are considered relative to classpath.",
   :var-type "function",
   :line 214,
   :file "src/clj/clojure/main.clj"}
  {:arglists ([& args]),
   :name "main",
   :namespace "clojure.main",
   :source-url
   "https://github.com/clojure/clojure/blob/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj#L318",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.main-api.html#clojure.main/main",
   :doc
   "Usage: java -cp clojure.jar clojure.main [init-opt*] [main-opt] [arg*]\n\nWith no options or args, runs an interactive Read-Eval-Print Loop\n\ninit options:\n  -i, --init path   Load a file or resource\n  -e, --eval string Evaluate expressions in string; print non-nil values\n\nmain options:\n  -r, --repl        Run a repl\n  path              Run a script from from a file or resource\n  -                 Run a script from standard input\n  -h, -?, --help    Print this help message and exit\n\noperation:\n\n  - Establishes thread-local bindings for commonly set!-able vars\n  - Enters the user namespace\n  - Binds *command-line-args* to a seq of strings containing command line\n    args that appear after any main option\n  - Runs all init options in order\n  - Runs a repl or script if requested\n\nThe init options may be repeated and mixed freely, but must appear before\nany main option. The appearance of any eval option before running a repl\nsuppresses the usual repl greeting message: \"Clojure ~(clojure-version)\".\n\nPaths may be absolute or relative in the filesystem or relative to\nclasspath. Classpath-relative paths have prefix of @ or @/",
   :var-type "function",
   :line 318,
   :file "src/clj/clojure/main.clj"}
  {:arglists ([& options]),
   :name "repl",
   :namespace "clojure.main",
   :source-url
   "https://github.com/clojure/clojure/blob/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj#L118",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.main-api.html#clojure.main/repl",
   :doc
   "Generic, reusable, read-eval-print loop. By default, reads from *in*,\nwrites to *out*, and prints exception summaries to *err*. If you use the\ndefault :read hook, *in* must either be an instance of\nLineNumberingPushbackReader or duplicate its behavior of both supporting\n.unread and collapsing CR, LF, and CRLF into a single \\newline. Options\nare sequential keyword-value pairs. Available options and their defaults:\n\n   - :init, function of no arguments, initialization hook called with\n     bindings for set!-able vars in place.\n     default: #()\n\n   - :need-prompt, function of no arguments, called before each\n     read-eval-print except the first, the user will be prompted if it\n     returns true.\n     default: (if (instance? LineNumberingPushbackReader *in*)\n                #(.atLineStart *in*)\n                #(identity true))\n\n   - :prompt, function of no arguments, prompts for more input.\n     default: repl-prompt\n\n   - :flush, function of no arguments, flushes output\n     default: flush\n\n   - :read, function of two arguments, reads from *in*:\n       - returns its first argument to request a fresh prompt\n         - depending on need-prompt, this may cause the repl to prompt\n           before reading again\n       - returns its second argument to request an exit from the repl\n       - else returns the next object read from the input stream\n     default: repl-read\n\n   - :eval, funtion of one argument, returns the evaluation of its\n     argument\n     default: eval\n\n   - :print, function of one argument, prints its argument to the output\n     default: prn\n\n   - :caught, function of one argument, a throwable, called when\n     read, eval, or print throws an exception or error\n     default: repl-caught",
   :var-type "function",
   :line 118,
   :file "src/clj/clojure/main.clj"}
  {:arglists ([e]),
   :name "repl-caught",
   :namespace "clojure.main",
   :source-url
   "https://github.com/clojure/clojure/blob/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj#L113",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.main-api.html#clojure.main/repl-caught",
   :doc "Default :caught hook for repl",
   :var-type "function",
   :line 113,
   :file "src/clj/clojure/main.clj"}
  {:arglists ([throwable]),
   :name "repl-exception",
   :namespace "clojure.main",
   :source-url
   "https://github.com/clojure/clojure/blob/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj#L105",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.main-api.html#clojure.main/repl-exception",
   :doc
   "Returns CompilerExceptions in tact, but only the root cause of other\nthrowables",
   :var-type "function",
   :line 105,
   :file "src/clj/clojure/main.clj"}
  {:arglists ([]),
   :name "repl-prompt",
   :namespace "clojure.main",
   :source-url
   "https://github.com/clojure/clojure/blob/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj#L41",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.main-api.html#clojure.main/repl-prompt",
   :doc "Default :prompt hook for repl",
   :var-type "function",
   :line 41,
   :file "src/clj/clojure/main.clj"}
  {:arglists ([request-prompt request-exit]),
   :name "repl-read",
   :namespace "clojure.main",
   :source-url
   "https://github.com/clojure/clojure/blob/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj#L78",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.main-api.html#clojure.main/repl-read",
   :doc
   "Default :read hook for repl. Reads from *in* which must either be an\ninstance of LineNumberingPushbackReader or duplicate its behavior of both\nsupporting .unread and collapsing all of CR, LF, and CRLF into a single\n\\newline. repl-read:\n  - skips whitespace, then\n    - returns request-prompt on start of line, or\n    - returns request-exit on end of stream, or\n    - reads an object from the input stream, then\n      - skips the next input character if it's end of line, then\n      - returns the object.",
   :var-type "function",
   :line 78,
   :file "src/clj/clojure/main.clj"}
  {:arglists ([s]),
   :name "skip-if-eol",
   :namespace "clojure.main",
   :source-url
   "https://github.com/clojure/clojure/blob/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj#L46",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.main-api.html#clojure.main/skip-if-eol",
   :doc
   "If the next character on stream s is a newline, skips it, otherwise\nleaves the stream untouched. Returns :line-start, :stream-end, or :body\nto indicate the relative location of the next character on s. The stream\nmust either be an instance of LineNumberingPushbackReader or duplicate\nits behavior of both supporting .unread and collapsing all of CR, LF, and\nCRLF to a single \\newline.",
   :var-type "function",
   :line 46,
   :file "src/clj/clojure/main.clj"}
  {:arglists ([s]),
   :name "skip-whitespace",
   :namespace "clojure.main",
   :source-url
   "https://github.com/clojure/clojure/blob/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj#L60",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.main-api.html#clojure.main/skip-whitespace",
   :doc
   "Skips whitespace characters on stream s. Returns :line-start, :stream-end,\nor :body to indicate the relative location of the next character on s.\nInterprets comma as whitespace and semicolon as comment to end of line.\nDoes not interpret #! as comment to end of line because only one\ncharacter of lookahead is available. The stream must either be an\ninstance of LineNumberingPushbackReader or duplicate its behavior of both\nsupporting .unread and collapsing all of CR, LF, and CRLF to a single\n\\newline.",
   :var-type "function",
   :line 60,
   :file "src/clj/clojure/main.clj"}
  {:arglists ([& body]),
   :name "with-bindings",
   :namespace "clojure.main",
   :source-url
   "https://github.com/clojure/clojure/blob/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj#L20",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/04764db9b213687dd5d4325c67291f0b0ef3ff33/src/clj/clojure/main.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.main-api.html#clojure.main/with-bindings",
   :doc
   "Executes body in the context of thread-local bindings for several vars\nthat often need to be set!: *ns* *warn-on-reflection* *math-context*\n*print-meta* *print-length* *print-level* *compile-path*\n*command-line-args* *1 *2 *3 *e",
   :var-type "macro",
   :line 20,
   :file "src/clj/clojure/main.clj"}
  {:name "*print-base*",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L87",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/*print-base*",
   :doc "The base to use for printing integers and rationals.",
   :var-type "var",
   :line 87,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:name "*print-miser-width*",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L47",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/*print-miser-width*",
   :doc
   "The column at which to enter miser style. Depending on the dispatch table, \nmiser style add newlines in more places to try to keep lines short allowing for further \nlevels of nesting.",
   :var-type "var",
   :line 47,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:name "*print-pprint-dispatch*",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L34",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/*print-pprint-dispatch*",
   :doc
   "The pretty print dispatch function. Use with-pprint-dispatch or set-pprint-dispatch\nto modify.",
   :var-type "multimethod",
   :line 34,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:name "*print-pretty*",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L30",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/*print-pretty*",
   :doc "Bind to true if you want write to use pretty printing",
   :var-type "var",
   :line 30,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:name "*print-radix*",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L80",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/*print-radix*",
   :doc
   "Print a radix specifier in front of integers and rationals. If *print-base* is 2, 8, \nor 16, then the radix specifier used is #b, #o, or #x, respectively. Otherwise the \nradix specifier is in the form #XXr where XX is the decimal value of *print-base* ",
   :var-type "var",
   :line 80,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:name "*print-right-margin*",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L40",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/*print-right-margin*",
   :doc
   "Pretty printing will try to avoid anything going beyond this column.\nSet it to nil to have pprint let the line be arbitrarily long. This will ignore all \nnon-mandatory newlines.",
   :var-type "var",
   :line 40,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:name "*print-suppress-namespaces*",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L72",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/*print-suppress-namespaces*",
   :doc
   "Don't print namespaces with symbols. This is particularly useful when \npretty printing the results of macro expansions",
   :var-type "var",
   :line 72,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:arglists ([writer format-in & args]),
   :name "cl-format",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/d1e39b1ec7fc65907b13458d7ec70b0839f3f85e/src/clj/clojure/pprint/cl_format.clj#L27",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/d1e39b1ec7fc65907b13458d7ec70b0839f3f85e/src/clj/clojure/pprint/cl_format.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/cl-format",
   :doc
   "An implementation of a Common Lisp compatible format function. cl-format formats its\narguments to an output stream or string based on the format control string given. It \nsupports sophisticated formatting of structured data.\n\nWriter is an instance of java.io.Writer, true to output to *out* or nil to output \nto a string, format-in is the format control string and the remaining arguments \nare the data to be formatted.\n\nThe format control string is a string to be output with embedded 'format directives' \ndescribing how to format the various arguments passed in.\n\nIf writer is nil, cl-format returns the formatted result string. Otherwise, cl-format \nreturns nil.\n\nFor example:\n (let [results [46 38 22]]\n        (cl-format true \"There ~[are~;is~:;are~]~:* ~d result~:p: ~{~d~^, ~}~%\" \n                   (count results) results))\n\nPrints to *out*:\n There are 3 results: 46, 38, 22\n\nDetailed documentation on format control strings is available in the \"Common Lisp the \nLanguage, 2nd edition\", Chapter 22 (available online at:\nhttp://www.cs.cmu.edu/afs/cs.cmu.edu/project/ai-repository/ai/html/cltl/clm/node200.html#SECTION002633000000000000000) \nand in the Common Lisp HyperSpec at \nhttp://www.lispworks.com/documentation/HyperSpec/Body/22_c.htm",
   :var-type "function",
   :line 27,
   :file "src/clj/clojure/pprint/cl_format.clj"}
  {:arglists [[object]],
   :name "code-dispatch",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/d1e39b1ec7fc65907b13458d7ec70b0839f3f85e/src/clj/clojure/pprint/dispatch.clj#L375",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/d1e39b1ec7fc65907b13458d7ec70b0839f3f85e/src/clj/clojure/pprint/dispatch.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/code-dispatch",
   :doc
   "The pretty print dispatch function for pretty printing Clojure code.",
   :var-type "multimethod",
   :line 375,
   :file "src/clj/clojure/pprint/dispatch.clj"}
  {:arglists ([format-in]),
   :name "formatter",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/d1e39b1ec7fc65907b13458d7ec70b0839f3f85e/src/clj/clojure/pprint/cl_format.clj#L1857",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/d1e39b1ec7fc65907b13458d7ec70b0839f3f85e/src/clj/clojure/pprint/cl_format.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/formatter",
   :doc
   "Makes a function which can directly run format-in. The function is\nfn [stream & args] ... and returns nil unless the stream is nil (meaning \noutput to a string) in which case it returns the resulting string.\n\nformat-in can be either a control string or a previously compiled format.",
   :var-type "macro",
   :line 1857,
   :file "src/clj/clojure/pprint/cl_format.clj"}
  {:arglists ([format-in]),
   :name "formatter-out",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/d1e39b1ec7fc65907b13458d7ec70b0839f3f85e/src/clj/clojure/pprint/cl_format.clj#L1877",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/d1e39b1ec7fc65907b13458d7ec70b0839f3f85e/src/clj/clojure/pprint/cl_format.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/formatter-out",
   :doc
   "Makes a function which can directly run format-in. The function is\nfn [& args] ... and returns nil. This version of the formatter macro is\ndesigned to be used with *out* set to an appropriate Writer. In particular,\nthis is meant to be used as part of a pretty printer dispatch method.\n\nformat-in can be either a control string or a previously compiled format.",
   :var-type "macro",
   :line 1877,
   :file "src/clj/clojure/pprint/cl_format.clj"}
  {:arglists ([]),
   :name "fresh-line",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/d1e39b1ec7fc65907b13458d7ec70b0839f3f85e/src/clj/clojure/pprint/cl_format.clj#L1187",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/d1e39b1ec7fc65907b13458d7ec70b0839f3f85e/src/clj/clojure/pprint/cl_format.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/fresh-line",
   :doc
   "Make a newline if *out* is not already at the beginning of the line. If *out* is\nnot a pretty writer (which keeps track of columns), this function always outputs a newline.",
   :var-type "function",
   :line 1187,
   :file "src/clj/clojure/pprint/cl_format.clj"}
  {:arglists ([writer]),
   :name "get-pretty-writer",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/d1e39b1ec7fc65907b13458d7ec70b0839f3f85e/src/clj/clojure/pprint/cl_format.clj#L1145",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/d1e39b1ec7fc65907b13458d7ec70b0839f3f85e/src/clj/clojure/pprint/cl_format.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/get-pretty-writer",
   :doc
   "Returns the java.io.Writer passed in wrapped in a pretty writer proxy, unless it's \nalready a pretty writer. Generally, it is unneccesary to call this function, since pprint,\nwrite, and cl-format all call it if they need to. However if you want the state to be \npreserved across calls, you will want to wrap them with this. \n\nFor example, when you want to generate column-aware output with multiple calls to cl-format, \ndo it like in this example:\n\n    (defn print-table [aseq column-width]\n      (binding [*out* (get-pretty-writer *out*)]\n        (doseq [row aseq]\n          (doseq [col row]\n            (cl-format true \"~4D~7,vT\" col column-width))\n          (prn))))\n\nNow when you run:\n\n    user> (print-table (map #(vector % (* % %) (* % % %)) (range 1 11)) 8)\n\nIt prints a table of squares and cubes for the numbers from 1 to 10:\n\n       1      1       1    \n       2      4       8    \n       3      9      27    \n       4     16      64    \n       5     25     125    \n       6     36     216    \n       7     49     343    \n       8     64     512    \n       9     81     729    \n      10    100    1000",
   :var-type "function",
   :line 1145,
   :file "src/clj/clojure/pprint/cl_format.clj"}
  {:arglists ([]),
   :name "pp",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L254",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/pp",
   :doc
   "A convenience macro that pretty prints the last thing output. This is\nexactly equivalent to (pprint *1).",
   :var-type "macro",
   :line 254,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:arglists ([object] [object writer]),
   :name "pprint",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L241",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/pprint",
   :doc
   "Pretty print object to the optional output writer. If the writer is not provided, \nprint the object to the currently bound value of *out*.",
   :var-type "function",
   :line 241,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:arglists ([relative-to n]),
   :name "pprint-indent",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L341",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/pprint-indent",
   :doc
   "Create an indent at this point in the pretty printing stream. This defines how \nfollowing lines are indented. relative-to can be either :block or :current depending \nwhether the indent should be computed relative to the start of the logical block or\nthe current column position. n is an offset. \n\nThis function is intended for use when writing custom dispatch functions.\n\nOutput is sent to *out* which must be a pretty printing writer.",
   :var-type "function",
   :line 341,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:arglists [[options* body]],
   :name "pprint-logical-block",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L302",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/pprint-logical-block",
   :doc
   "Execute the body as a pretty printing logical block with output to *out* which \nmust be a pretty printing writer. When used from pprint or cl-format, this can be \nassumed. \n\nThis function is intended for use when writing custom dispatch functions.\n\nBefore the body, the caller can optionally specify options: :prefix, :per-line-prefix, \nand :suffix.",
   :var-type "macro",
   :line 302,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:arglists ([kind]),
   :name "pprint-newline",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L329",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/pprint-newline",
   :doc
   "Print a conditional newline to a pretty printing stream. kind specifies if the \nnewline is :linear, :miser, :fill, or :mandatory. \n\nThis function is intended for use when writing custom dispatch functions.\n\nOutput is sent to *out* which must be a pretty printing writer.",
   :var-type "function",
   :line 329,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:arglists ([kind colnum colinc]),
   :name "pprint-tab",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L356",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/pprint-tab",
   :doc
   "Tab at this point in the pretty printing stream. kind specifies whether the tab\nis :line, :section, :line-relative, or :section-relative. \n\nColnum and colinc specify the target column and the increment to move the target\nforward if the output is already past the original target.\n\nThis function is intended for use when writing custom dispatch functions.\n\nOutput is sent to *out* which must be a pretty printing writer.\n\nTHIS FUNCTION IS NOT YET IMPLEMENTED.",
   :var-type "function",
   :line 356,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:arglists ([function]),
   :name "set-pprint-dispatch",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L260",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/set-pprint-dispatch",
   :doc
   "Set the pretty print dispatch function to a function matching (fn [obj] ...)\nwhere obj is the object to pretty print. That function will be called with *out* set\nto a pretty printing writer to which it should do its printing.\n\nFor example functions, see simple-dispatch and code-dispatch in \nclojure.pprint.dispatch.clj.",
   :var-type "function",
   :line 260,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:arglists [[object]],
   :name "simple-dispatch",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/d1e39b1ec7fc65907b13458d7ec70b0839f3f85e/src/clj/clojure/pprint/dispatch.clj#L147",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/d1e39b1ec7fc65907b13458d7ec70b0839f3f85e/src/clj/clojure/pprint/dispatch.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/simple-dispatch",
   :doc
   "The pretty print dispatch function for simple data structure format.",
   :var-type "multimethod",
   :line 147,
   :file "src/clj/clojure/pprint/dispatch.clj"}
  {:arglists ([function & body]),
   :name "with-pprint-dispatch",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L274",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/with-pprint-dispatch",
   :doc
   "Execute body with the pretty print dispatch function bound to function.",
   :var-type "macro",
   :line 274,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:arglists ([object & kw-args]),
   :name "write",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L197",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/write",
   :doc
   "Write an object subject to the current bindings of the printer control variables.\nUse the kw-args argument to override individual variables for this call (and any \nrecursive calls). Returns the string result if :stream is nil or nil otherwise.\n\nThe following keyword arguments can be passed with values:\n  Keyword              Meaning                              Default value\n  :stream              Writer for output or nil             true (indicates *out*)\n  :base                Base to use for writing rationals    Current value of *print-base*\n  :circle*             If true, mark circular structures    Current value of *print-circle*\n  :length              Maximum elements to show in sublists Current value of *print-length*\n  :level               Maximum depth                        Current value of *print-level*\n  :lines*              Maximum lines of output              Current value of *print-lines*\n  :miser-width         Width to enter miser mode            Current value of *print-miser-width*\n  :dispatch            The pretty print dispatch function   Current value of *print-pprint-dispatch*\n  :pretty              If true, do pretty printing          Current value of *print-pretty*\n  :radix               If true, prepend a radix specifier   Current value of *print-radix*\n  :readably*           If true, print readably              Current value of *print-readably*\n  :right-margin        The column for the right margin      Current value of *print-right-margin*\n  :suppress-namespaces If true, no namespaces in symbols    Current value of *print-suppress-namespaces*\n\n  * = not yet supported",
   :var-type "function",
   :line 197,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:arglists ([object]),
   :name "write-out",
   :namespace "clojure.pprint",
   :source-url
   "https://github.com/clojure/clojure/blob/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj#L171",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a642708b6e9a1718b74248cc28a467bd53afc81f/src/clj/clojure/pprint/pprint_base.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.pprint-api.html#clojure.pprint/write-out",
   :doc
   "Write an object to *out* subject to the current bindings of the printer control \nvariables. Use the kw-args argument to override individual variables for this call (and \nany recursive calls).\n\n*out* must be a PrettyWriter if pretty printing is enabled. This is the responsibility\nof the caller.\n\nThis method is primarily intended for use by pretty print dispatch functions that \nalready know that the pretty printer will have set up their environment appropriately.\nNormal library clients should use the standard \"write\" interface. ",
   :var-type "function",
   :line 171,
   :file "src/clj/clojure/pprint/pprint_base.clj"}
  {:arglists ([str-or-pattern]),
   :name "apropos",
   :namespace "clojure.repl",
   :source-url
   "https://github.com/clojure/clojure/blob/40f3dc93b926721e94b75a10a9c88815ea4691aa/src/clj/clojure/repl.clj#L52",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/40f3dc93b926721e94b75a10a9c88815ea4691aa/src/clj/clojure/repl.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.repl-api.html#clojure.repl/apropos",
   :doc
   "Given a regular expression or stringable thing, return a seq of\nall definitions in all currently-loaded namespaces that match the\nstr-or-pattern.",
   :var-type "function",
   :line 52,
   :file "src/clj/clojure/repl.clj"}
  {:arglists ([nsname]),
   :name "dir",
   :namespace "clojure.repl",
   :source-url
   "https://github.com/clojure/clojure/blob/40f3dc93b926721e94b75a10a9c88815ea4691aa/src/clj/clojure/repl.clj#L70",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/40f3dc93b926721e94b75a10a9c88815ea4691aa/src/clj/clojure/repl.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.repl-api.html#clojure.repl/dir",
   :doc "Prints a sorted directory of public vars in a namespace",
   :var-type "macro",
   :line 70,
   :file "src/clj/clojure/repl.clj"}
  {:arglists ([ns]),
   :name "dir-fn",
   :namespace "clojure.repl",
   :source-url
   "https://github.com/clojure/clojure/blob/40f3dc93b926721e94b75a10a9c88815ea4691aa/src/clj/clojure/repl.clj#L64",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/40f3dc93b926721e94b75a10a9c88815ea4691aa/src/clj/clojure/repl.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.repl-api.html#clojure.repl/dir-fn",
   :doc
   "Returns a sorted seq of symbols naming public vars in\na namespace",
   :var-type "function",
   :line 64,
   :file "src/clj/clojure/repl.clj"}
  {:arglists ([n]),
   :name "source",
   :namespace "clojure.repl",
   :source-url
   "https://github.com/clojure/clojure/blob/40f3dc93b926721e94b75a10a9c88815ea4691aa/src/clj/clojure/repl.clj#L43",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/40f3dc93b926721e94b75a10a9c88815ea4691aa/src/clj/clojure/repl.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.repl-api.html#clojure.repl/source",
   :doc
   "Prints the source code for the given symbol, if it can find it.\nThis requires that the symbol resolve to a Var defined in a\nnamespace for which the .clj is in the classpath.\n\nExample: (source filter)",
   :var-type "macro",
   :line 43,
   :file "src/clj/clojure/repl.clj"}
  {:arglists ([x]),
   :name "source-fn",
   :namespace "clojure.repl",
   :source-url
   "https://github.com/clojure/clojure/blob/40f3dc93b926721e94b75a10a9c88815ea4691aa/src/clj/clojure/repl.clj#L21",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/40f3dc93b926721e94b75a10a9c88815ea4691aa/src/clj/clojure/repl.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.repl-api.html#clojure.repl/source-fn",
   :doc
   "Returns a string of the source code for the given symbol, if it can\nfind it.  This requires that the symbol resolve to a Var defined in\na namespace for which the .clj is in the classpath.  Returns nil if\nit can't find the source.  For most REPL usage, 'source' is more\nconvenient.\n\nExample: (source-fn 'filter)",
   :var-type "function",
   :line 21,
   :file "src/clj/clojure/repl.clj"}
  {:arglists ([s1] [s1 s2] [s1 s2 & sets]),
   :name "difference",
   :namespace "clojure.set",
   :source-url
   "https://github.com/clojure/clojure/blob/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj#L48",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.set-api.html#clojure.set/difference",
   :doc
   "Return a set that is the first set without elements of the remaining sets",
   :var-type "function",
   :line 48,
   :file "src/clj/clojure/set.clj"}
  {:arglists ([xrel ks]),
   :name "index",
   :namespace "clojure.set",
   :source-url
   "https://github.com/clojure/clojure/blob/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj#L95",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.set-api.html#clojure.set/index",
   :doc
   "Returns a map of the distinct values of ks in the xrel mapped to a\nset of the maps in xrel with the corresponding values of ks.",
   :var-type "function",
   :line 95,
   :file "src/clj/clojure/set.clj"}
  {:arglists ([s1] [s1 s2] [s1 s2 & sets]),
   :name "intersection",
   :namespace "clojure.set",
   :source-url
   "https://github.com/clojure/clojure/blob/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj#L32",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.set-api.html#clojure.set/intersection",
   :doc "Return a set that is the intersection of the input sets",
   :var-type "function",
   :line 32,
   :file "src/clj/clojure/set.clj"}
  {:arglists ([xrel yrel] [xrel yrel km]),
   :name "join",
   :namespace "clojure.set",
   :source-url
   "https://github.com/clojure/clojure/blob/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj#L111",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.set-api.html#clojure.set/join",
   :doc
   "When passed 2 rels, returns the rel corresponding to the natural\njoin. When passed an additional keymap, joins on the corresponding\nkeys.",
   :var-type "function",
   :line 111,
   :file "src/clj/clojure/set.clj"}
  {:arglists ([m]),
   :name "map-invert",
   :namespace "clojure.set",
   :source-url
   "https://github.com/clojure/clojure/blob/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj#L106",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.set-api.html#clojure.set/map-invert",
   :doc "Returns the map with the vals mapped to the keys.",
   :var-type "function",
   :line 106,
   :file "src/clj/clojure/set.clj"}
  {:arglists ([xrel ks]),
   :name "project",
   :namespace "clojure.set",
   :source-url
   "https://github.com/clojure/clojure/blob/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj#L71",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.set-api.html#clojure.set/project",
   :doc
   "Returns a rel of the elements of xrel with only the keys in ks",
   :var-type "function",
   :line 71,
   :file "src/clj/clojure/set.clj"}
  {:arglists ([xrel kmap]),
   :name "rename",
   :namespace "clojure.set",
   :source-url
   "https://github.com/clojure/clojure/blob/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj#L89",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.set-api.html#clojure.set/rename",
   :doc
   "Returns a rel of the maps in xrel with the keys in kmap renamed to the vals in kmap",
   :var-type "function",
   :line 89,
   :file "src/clj/clojure/set.clj"}
  {:arglists ([map kmap]),
   :name "rename-keys",
   :namespace "clojure.set",
   :source-url
   "https://github.com/clojure/clojure/blob/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj#L77",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.set-api.html#clojure.set/rename-keys",
   :doc
   "Returns the map with the keys in kmap renamed to the vals in kmap",
   :var-type "function",
   :line 77,
   :file "src/clj/clojure/set.clj"}
  {:arglists ([pred xset]),
   :name "select",
   :namespace "clojure.set",
   :source-url
   "https://github.com/clojure/clojure/blob/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj#L64",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.set-api.html#clojure.set/select",
   :doc "Returns a set of the elements for which pred is true",
   :var-type "function",
   :line 64,
   :file "src/clj/clojure/set.clj"}
  {:arglists ([set1 set2]),
   :name "subset?",
   :namespace "clojure.set",
   :source-url
   "https://github.com/clojure/clojure/blob/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj#L142",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.set-api.html#clojure.set/subset?",
   :doc "Is set1 a subset of set2?",
   :var-type "function",
   :line 142,
   :file "src/clj/clojure/set.clj"}
  {:arglists ([set1 set2]),
   :name "superset?",
   :namespace "clojure.set",
   :source-url
   "https://github.com/clojure/clojure/blob/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj#L150",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.set-api.html#clojure.set/superset?",
   :doc "Is set1 a superset of set2?",
   :var-type "function",
   :line 150,
   :file "src/clj/clojure/set.clj"}
  {:arglists ([] [s1] [s1 s2] [s1 s2 & sets]),
   :name "union",
   :namespace "clojure.set",
   :source-url
   "https://github.com/clojure/clojure/blob/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj#L19",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a07040032714a2f88c23b76c6484c1b8acd462b0/src/clj/clojure/set.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.set-api.html#clojure.set/union",
   :doc "Return a set that is the union of the input sets",
   :var-type "function",
   :line 19,
   :file "src/clj/clojure/set.clj"}
  {:arglists ([]),
   :name "e",
   :namespace "clojure.stacktrace",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/stacktrace.clj#L74",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/stacktrace.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.stacktrace-api.html#clojure.stacktrace/e",
   :doc
   "REPL utility.  Prints a brief stack trace for the root cause of the\nmost recent exception.",
   :var-type "function",
   :line 74,
   :file "src/clj/clojure/stacktrace.clj"}
  {:arglists ([tr] [tr n]),
   :name "print-cause-trace",
   :namespace "clojure.stacktrace",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/stacktrace.clj#L64",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/stacktrace.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.stacktrace-api.html#clojure.stacktrace/print-cause-trace",
   :doc
   "Like print-stack-trace but prints chained exceptions (causes).",
   :var-type "function",
   :line 64,
   :file "src/clj/clojure/stacktrace.clj"}
  {:arglists ([tr] [tr n]),
   :name "print-stack-trace",
   :namespace "clojure.stacktrace",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/stacktrace.clj#L44",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/stacktrace.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.stacktrace-api.html#clojure.stacktrace/print-stack-trace",
   :doc
   "Prints a Clojure-oriented stack trace of tr, a Throwable.\nPrints a maximum of n stack frames (default: unlimited).\nDoes not print chained exceptions (causes).",
   :var-type "function",
   :line 44,
   :file "src/clj/clojure/stacktrace.clj"}
  {:arglists ([tr]),
   :name "print-throwable",
   :namespace "clojure.stacktrace",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/stacktrace.clj#L38",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/stacktrace.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.stacktrace-api.html#clojure.stacktrace/print-throwable",
   :doc "Prints the class and message of a Throwable.",
   :var-type "function",
   :line 38,
   :file "src/clj/clojure/stacktrace.clj"}
  {:arglists ([e]),
   :name "print-trace-element",
   :namespace "clojure.stacktrace",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/stacktrace.clj#L26",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/stacktrace.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.stacktrace-api.html#clojure.stacktrace/print-trace-element",
   :doc
   "Prints a Clojure-oriented view of one element in a stack trace.",
   :var-type "function",
   :line 26,
   :file "src/clj/clojure/stacktrace.clj"}
  {:arglists ([tr]),
   :name "root-cause",
   :namespace "clojure.stacktrace",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/stacktrace.clj#L18",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/stacktrace.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.stacktrace-api.html#clojure.stacktrace/root-cause",
   :doc "Returns the last 'cause' Throwable in a chain of Throwables.",
   :var-type "function",
   :line 18,
   :file "src/clj/clojure/stacktrace.clj"}
  {:arglists ([s]),
   :name "blank?",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L225",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/blank?",
   :doc "True if s is nil, empty, or contains only whitespace.",
   :var-type "function",
   :line 225,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([s]),
   :name "capitalize",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L146",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/capitalize",
   :doc
   "Converts first character of the string to upper-case, all other\ncharacters to lower-case.",
   :var-type "function",
   :line 146,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([s cmap]),
   :name "escape",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L238",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/escape",
   :doc
   "Return a new string, using cmap to escape each character ch\nfrom s as follows:\n\nIf (cmap ch) is nil, append ch to the new string.\nIf (cmap ch) is non-nil, append (str (cmap ch)) instead.",
   :var-type "function",
   :line 238,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([coll] [separator [x & more]]),
   :name "join",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L130",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/join",
   :doc
   "Returns a string of all elements in coll, separated by\nan optional separator.  Like Perl's join.",
   :var-type "function",
   :line 130,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([s]),
   :name "lower-case",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L163",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/lower-case",
   :doc "Converts string to all lower-case.",
   :var-type "function",
   :line 163,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([s match replacement]),
   :name "replace",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L63",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/replace",
   :doc
   "Replaces all instance of match with replacement in s.\n\nmatch/replacement can be:\n\nstring / string\nchar / char\npattern / (string or function of match).\n\nSee also replace-first.",
   :var-type "function",
   :line 63,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([s match replacement]),
   :name "replace-first",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L103",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/replace-first",
   :doc
   "Replaces the first instance of match with replacement in s.\n\nmatch/replacement can be:\n\nchar / char\nstring / string\npattern / (string or function of match).\n\nSee also replace-all.",
   :var-type "function",
   :line 103,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([s]),
   :name "reverse",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L46",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/reverse",
   :doc "Returns s with its characters reversed.",
   :var-type "function",
   :line 46,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([s re] [s re limit]),
   :name "split",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L169",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/split",
   :doc
   "Splits string on a regular expression.  Optional argument limit is\nthe maximum number of splits. Not lazy. Returns vector of the splits.",
   :var-type "function",
   :line 169,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([s]),
   :name "split-lines",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L178",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/split-lines",
   :doc "Splits s on \\n or \\r\\n.",
   :var-type "function",
   :line 178,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([s]),
   :name "trim",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L184",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/trim",
   :doc "Removes whitespace from both ends of string.",
   :var-type "function",
   :line 184,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([s]),
   :name "trim-newline",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L212",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/trim-newline",
   :doc
   "Removes all trailing newline \\n or return \\r characters from\nstring.  Similar to Perl's chomp.",
   :var-type "function",
   :line 212,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([s]),
   :name "triml",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L190",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/triml",
   :doc "Removes whitespace from the left side of string.",
   :var-type "function",
   :line 190,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([s]),
   :name "trimr",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L201",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/trimr",
   :doc "Removes whitespace from the right side of string.",
   :var-type "function",
   :line 201,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([s]),
   :name "upper-case",
   :namespace "clojure.string",
   :source-url
   "https://github.com/clojure/clojure/blob/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj#L157",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fde4f64bb5eb5c87b618b37e3d69ac37f1531524/src/clj/clojure/string.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.string-api.html#clojure.string/upper-case",
   :doc "Converts string to all upper-case.",
   :var-type "function",
   :line 157,
   :file "src/clj/clojure/string.clj"}
  {:arglists ([argv expr values]),
   :name "apply-template",
   :namespace "clojure.template",
   :source-url
   "https://github.com/clojure/clojure/blob/787938361128c2bc21ed896dd4523651b59cb420/src/clj/clojure/template.clj#L30",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/787938361128c2bc21ed896dd4523651b59cb420/src/clj/clojure/template.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.template-api.html#clojure.template/apply-template",
   :doc
   "For use in macros.  argv is an argument list, as in defn.  expr is\na quoted expression using the symbols in argv.  values is a sequence\nof values to be used for the arguments.\n\napply-template will recursively replace argument symbols in expr\nwith their corresponding values, returning a modified expr.\n\nExample: (apply-template '[x] '(+ x x) '[2])\n         ;=> (+ 2 2)",
   :var-type "function",
   :line 30,
   :file "src/clj/clojure/template.clj"}
  {:arglists ([argv expr & values]),
   :name "do-template",
   :namespace "clojure.template",
   :source-url
   "https://github.com/clojure/clojure/blob/787938361128c2bc21ed896dd4523651b59cb420/src/clj/clojure/template.clj#L45",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/787938361128c2bc21ed896dd4523651b59cb420/src/clj/clojure/template.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.template-api.html#clojure.template/do-template",
   :doc
   "Repeatedly copies expr (in a do block) for each group of arguments\nin values.  values are automatically partitioned by the number of\narguments in argv, an argument vector as in defn.\n\nExample: (macroexpand '(do-template [x y] (+ y x) 2 4 3 5))\n         ;=> (do (+ 4 2) (+ 5 3))",
   :var-type "macro",
   :line 45,
   :file "src/clj/clojure/template.clj"}
  {:name "*load-tests*",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L239",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/*load-tests*",
   :doc
   "True by default.  If set to false, no test functions will\nbe created by deftest, set-test, or with-test.  Use this to omit\ntests when compiling or loading production code.",
   :var-type "var",
   :line 239,
   :file "src/clj/clojure/test.clj"}
  {:name "*stack-trace-depth*",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L246",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/*stack-trace-depth*",
   :doc
   "The maximum depth of stack traces to print when an Exception\nis thrown during a test.  Defaults to nil, which means print the \ncomplete stack trace.",
   :var-type "var",
   :line 246,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([argv expr & args]),
   :name "are",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L551",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/are",
   :doc
   "Checks multiple assertions with a template expression.\nSee clojure.template/do-template for an explanation of\ntemplates.\n\nExample: (are [x y] (= x y)  \n              2 (+ 1 1)\n              4 (* 2 2))\nExpands to: \n         (do (is (= 2 (+ 1 1)))\n             (is (= 4 (* 2 2))))\n\nNote: This breaks some reporting features, such as line numbers.",
   :var-type "macro",
   :line 551,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([msg form]),
   :name "assert-any",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L434",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/assert-any",
   :doc
   "Returns generic assertion code for any test, including macros, Java\nmethod calls, or isolated symbols.",
   :var-type "function",
   :line 434,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([msg form]),
   :name "assert-predicate",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L415",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/assert-predicate",
   :doc
   "Returns generic assertion code for any functional predicate.  The\n'expected' argument to 'report' will contains the original form, the\n'actual' argument will contain the form with all its sub-forms\nevaluated.  If the predicate returns false, the 'actual' form will\nbe wrapped in (not...).",
   :var-type "function",
   :line 415,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([f1 f2]),
   :name "compose-fixtures",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L660",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/compose-fixtures",
   :doc
   "Composes two fixture functions, creating a new fixture function\nthat combines their behavior.",
   :var-type "function",
   :line 660,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([name & body]),
   :name "deftest",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L593",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/deftest",
   :doc
   "Defines a test function with no arguments.  Test functions may call\nother tests, so tests may be composed.  If you compose tests, you\nshould also define a function named test-ns-hook; run-tests will\ncall test-ns-hook instead of testing all vars.\n\nNote: Actually, the test body goes in the :test metadata on the var,\nand the real function (the value of the var) calls test-var on\nitself.\n\nWhen *load-tests* is false, deftest is ignored.",
   :var-type "macro",
   :line 593,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([name & body]),
   :name "deftest-",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L610",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/deftest-",
   :doc "Like deftest but creates a private var.",
   :var-type "macro",
   :line 610,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([m]),
   :name "do-report",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L335",
   :added "1.2",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/do-report",
   :doc
   "Add file and line information to a test result and call report.\nIf you are writing a custom assert-expr method, call this function\nto pass test results to report.",
   :var-type "function",
   :line 335,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([n]),
   :name "file-position",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L276",
   :deprecated "1.2",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/file-position",
   :doc
   "Returns a vector [filename line-number] for the nth call up the\nstack.\n\nDeprecated in 1.2: The information needed for test reporting is\nnow on :file and :line keys in the result map.",
   :var-type "function",
   :line 276,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([x]),
   :name "function?",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L403",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/function?",
   :doc
   "Returns true if argument is a function or a symbol that resolves to\na function (not a macro).",
   :var-type "function",
   :line 403,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([v]),
   :name "get-possibly-unbound-var",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L395",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/get-possibly-unbound-var",
   :doc "Like var-get but returns nil if the var is unbound.",
   :var-type "function",
   :line 395,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([name]),
   :name "inc-report-counter",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L308",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/inc-report-counter",
   :doc
   "Increments the named counter in *report-counters*, a ref to a map.\nDoes nothing if *report-counters* is nil.",
   :var-type "function",
   :line 308,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([form] [form msg]),
   :name "is",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L533",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/is",
   :doc
   "Generic assertion macro.  'form' is any predicate test.\n'msg' is an optional message to attach to the assertion.\n\nExample: (is (= 4 (+ 2 2)) \"Two plus two should be 4\")\n\nSpecial forms:\n\n(is (thrown? c body)) checks that an instance of c is thrown from\nbody, fails if not; then returns the thing thrown.\n\n(is (thrown-with-msg? c re body)) checks that an instance of c is\nthrown AND that the message on the exception matches (with\nre-find) the regular expression re.",
   :var-type "macro",
   :line 533,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([fixtures]),
   :name "join-fixtures",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L667",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/join-fixtures",
   :doc
   "Composes a collection of fixtures, in order.  Always returns a valid\nfixture function, even if the collection is empty.",
   :var-type "function",
   :line 667,
   :file "src/clj/clojure/test.clj"}
  {:name "report",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L319",
   :dynamic true,
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/report",
   :doc
   "Generic reporting function, may be overridden to plug in\ndifferent report formats (e.g., TAP, JUnit).  Assertions such as\n'is' call 'report' to indicate results.  The argument given to\n'report' will be a map with a :type key.  See the documentation at\nthe top of test_is.clj for more information on the types of\narguments for 'report'.",
   :var-type "multimethod",
   :line 319,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([] [re]),
   :name "run-all-tests",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L743",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/run-all-tests",
   :doc
   "Runs all tests in all namespaces; prints results.\nOptional argument is a regular expression; only namespaces with\nnames matching the regular expression (with re-matches) will be\ntested.",
   :var-type "function",
   :line 743,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([] [& namespaces]),
   :name "run-tests",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L731",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/run-tests",
   :doc
   "Runs all tests in the given namespaces; prints results.\nDefaults to current namespace if none given.  Returns a map\nsummarizing test results.",
   :var-type "function",
   :line 731,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([name & body]),
   :name "set-test",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L619",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/set-test",
   :doc
   "Experimental.\nSets :test metadata of the named var to a fn with the given body.\nThe var must already exist.  Does not modify the value of the var.\n\nWhen *load-tests* is false, set-test is ignored.",
   :var-type "macro",
   :line 619,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([summary]),
   :name "successful?",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L752",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/successful?",
   :doc
   "Returns true if the given test summary indicates all tests\nwere successful, false otherwise.",
   :var-type "function",
   :line 752,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([ns]),
   :name "test-all-vars",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L694",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/test-all-vars",
   :doc
   "Calls test-var on every var interned in the namespace, with fixtures.",
   :var-type "function",
   :line 694,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([ns]),
   :name "test-ns",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L706",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/test-ns",
   :doc
   "If the namespace defines a function named test-ns-hook, calls that.\nOtherwise, calls test-all-vars on the namespace.  'ns' is a\nnamespace object or a symbol.\n\nInternally binds *report-counters* to a ref initialized to\n*inital-report-counters*.  Returns the final, dereferenced state of\n*report-counters*.",
   :var-type "function",
   :line 706,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([v]),
   :name "test-var",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L679",
   :dynamic true,
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/test-var",
   :doc
   "If v has a function in its :test metadata, calls that function,\nwith *testing-vars* bound to (conj *testing-vars* v).",
   :var-type "function",
   :line 679,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([string & body]),
   :name "testing",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L568",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/testing",
   :doc
   "Adds a new string to the list of testing contexts.  May be nested,\nbut must occur inside a test function (deftest).",
   :var-type "macro",
   :line 568,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([]),
   :name "testing-contexts-str",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L301",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/testing-contexts-str",
   :doc
   "Returns a string representation of the current test context. Joins\nstrings in *testing-contexts* with spaces.",
   :var-type "function",
   :line 301,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([m]),
   :name "testing-vars-str",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L288",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/testing-vars-str",
   :doc
   "Returns a string representation of the current test.  Renders names\nin *testing-vars* as a list, then the source file and line of\ncurrent assertion.",
   :var-type "function",
   :line 288,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([msg form]),
   :name "try-expr",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L517",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/try-expr",
   :doc
   "Used by the 'is' macro to catch unexpected exceptions.\nYou don't call this.",
   :var-type "macro",
   :line 517,
   :file "src/clj/clojure/test.clj"}
  {:name "use-fixtures",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L641",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/use-fixtures",
   :doc
   "Wrap test runs in a fixture function to perform setup and\nteardown. Using a fixture-type of :each wraps every test\nindividually, while:once wraps the whole run in a single function.",
   :var-type "multimethod",
   :line 641,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([definition & body]),
   :name "with-test",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L580",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/with-test",
   :doc
   "Takes any definition form (that returns a Var) as the first argument.\nRemaining body goes in the :test metadata function for that Var.\n\nWhen *load-tests* is false, only evaluates the definition, ignoring\nthe tests.",
   :var-type "macro",
   :line 580,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([& body]),
   :name "with-test-out",
   :namespace "clojure.test",
   :source-url
   "https://github.com/clojure/clojure/blob/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj#L267",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/a9d9ddb6ad4f86809d44f8e3370ae284f0a084f2/src/clj/clojure/test.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test/with-test-out",
   :doc "Runs body with *out* bound to the value of *test-out*.",
   :var-type "macro",
   :line 267,
   :file "src/clj/clojure/test.clj"}
  {:arglists ([m]),
   :name "keywordize-keys",
   :namespace "clojure.walk",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj#L95",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.walk-api.html#clojure.walk/keywordize-keys",
   :doc
   "Recursively transforms all map keys from strings to keywords.",
   :var-type "function",
   :line 95,
   :file "src/clj/clojure/walk.clj"}
  {:arglists ([form]),
   :name "macroexpand-all",
   :namespace "clojure.walk",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj#L127",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.walk-api.html#clojure.walk/macroexpand-all",
   :doc "Recursively performs all possible macroexpansions in form.",
   :var-type "function",
   :line 127,
   :file "src/clj/clojure/walk.clj"}
  {:arglists ([f form]),
   :name "postwalk",
   :namespace "clojure.walk",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj#L53",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.walk-api.html#clojure.walk/postwalk",
   :doc
   "Performs a depth-first, post-order traversal of form.  Calls f on\neach sub-form, uses f's return value in place of the original.\nRecognizes all Clojure data structures except sorted-map-by.\nConsumes seqs as with doall.",
   :var-type "function",
   :line 53,
   :file "src/clj/clojure/walk.clj"}
  {:arglists ([form]),
   :name "postwalk-demo",
   :namespace "clojure.walk",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj#L81",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.walk-api.html#clojure.walk/postwalk-demo",
   :doc
   "Demonstrates the behavior of postwalk by printing each form as it is\nwalked.  Returns form.",
   :var-type "function",
   :line 81,
   :file "src/clj/clojure/walk.clj"}
  {:arglists ([smap form]),
   :name "postwalk-replace",
   :namespace "clojure.walk",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj#L119",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.walk-api.html#clojure.walk/postwalk-replace",
   :doc
   "Recursively transforms form by replacing keys in smap with their\nvalues.  Like clojure/replace but works on any data structure.  Does\nreplacement at the leaves of the tree first.",
   :var-type "function",
   :line 119,
   :file "src/clj/clojure/walk.clj"}
  {:arglists ([f form]),
   :name "prewalk",
   :namespace "clojure.walk",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj#L62",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.walk-api.html#clojure.walk/prewalk",
   :doc "Like postwalk, but does pre-order traversal.",
   :var-type "function",
   :line 62,
   :file "src/clj/clojure/walk.clj"}
  {:arglists ([form]),
   :name "prewalk-demo",
   :namespace "clojure.walk",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj#L88",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.walk-api.html#clojure.walk/prewalk-demo",
   :doc
   "Demonstrates the behavior of prewalk by printing each form as it is\nwalked.  Returns form.",
   :var-type "function",
   :line 88,
   :file "src/clj/clojure/walk.clj"}
  {:arglists ([smap form]),
   :name "prewalk-replace",
   :namespace "clojure.walk",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj#L111",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.walk-api.html#clojure.walk/prewalk-replace",
   :doc
   "Recursively transforms form by replacing keys in smap with their\nvalues.  Like clojure/replace but works on any data structure.  Does\nreplacement at the root of the tree first.",
   :var-type "function",
   :line 111,
   :file "src/clj/clojure/walk.clj"}
  {:arglists ([m]),
   :name "stringify-keys",
   :namespace "clojure.walk",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj#L103",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.walk-api.html#clojure.walk/stringify-keys",
   :doc
   "Recursively transforms all map keys from keywords to strings.",
   :var-type "function",
   :line 103,
   :file "src/clj/clojure/walk.clj"}
  {:arglists ([inner outer form]),
   :name "walk",
   :namespace "clojure.walk",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj#L35",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/walk.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.walk-api.html#clojure.walk/walk",
   :doc
   "Traverses form, an arbitrary data structure.  inner and outer are\nfunctions.  Applies inner to each element of form, building up a\ndata structure of the same type, then applies outer to the result.\nRecognizes all Clojure data structures except sorted-map-by.\nConsumes seqs as with doall.",
   :var-type "function",
   :line 35,
   :file "src/clj/clojure/walk.clj"}
  {:arglists ([s] [s startparse]),
   :name "parse",
   :namespace "clojure.xml",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/xml.clj#L78",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/xml.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.xml-api.html#clojure.xml/parse",
   :doc
   "Parses and loads the source s, which can be a File, InputStream or\nString naming a URI. Returns a tree of the xml/element struct-map,\nwhich has the keys :tag, :attrs, and :content. and accessor fns tag,\nattrs, and content. Other parsers can be supplied by passing\nstartparse, a fn taking a source and a ContentHandler and returning\na parser",
   :var-type "function",
   :line 78,
   :file "src/clj/clojure/xml.clj"}
  {:arglists ([loc item]),
   :name "append-child",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L223",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/append-child",
   :doc
   "Inserts the item as the rightmost child of the node at this loc,\nwithout moving",
   :var-type "function",
   :line 223,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "branch?",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L69",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/branch?",
   :doc "Returns true if the node at loc is a branch",
   :var-type "function",
   :line 69,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "children",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L75",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/children",
   :doc
   "Returns a seq of the children of node at loc, which must be a branch",
   :var-type "function",
   :line 75,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "down",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L109",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/down",
   :doc
   "Returns the loc of the leftmost child of the node at this loc, or\nnil if no children",
   :var-type "function",
   :line 109,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc f & args]),
   :name "edit",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L210",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/edit",
   :doc
   "Replaces the node at this loc with the value of (f node args)",
   :var-type "function",
   :line 210,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "end?",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L258",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/end?",
   :doc "Returns true if loc represents the end of a depth-first walk",
   :var-type "function",
   :line 258,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc item]),
   :name "insert-child",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L216",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/insert-child",
   :doc
   "Inserts the item as the leftmost child of the node at this loc,\nwithout moving",
   :var-type "function",
   :line 216,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc item]),
   :name "insert-left",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L183",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/insert-left",
   :doc
   "Inserts the item as the left sibling of the node at this loc,\nwithout moving",
   :var-type "function",
   :line 183,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc item]),
   :name "insert-right",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L193",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/insert-right",
   :doc
   "Inserts the item as the right sibling of the node at this loc,\nwithout moving",
   :var-type "function",
   :line 193,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "left",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L166",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/left",
   :doc
   "Returns the loc of the left sibling of the node at this loc, or nil",
   :var-type "function",
   :line 166,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "leftmost",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L174",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/leftmost",
   :doc
   "Returns the loc of the leftmost sibling of the node at this loc, or self",
   :var-type "function",
   :line 174,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "lefts",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L96",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/lefts",
   :doc "Returns a seq of the left siblings of this loc",
   :var-type "function",
   :line 96,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc node children]),
   :name "make-node",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L83",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/make-node",
   :doc
   "Returns a new branch node, given an existing node and new\nchildren. The loc is only used to supply the constructor.",
   :var-type "function",
   :line 83,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "next",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L230",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/next",
   :doc
   "Moves to the next loc in the hierarchy, depth-first. When reaching\nthe end, returns a distinguished loc detectable via end?. If already\nat the end, stays there.",
   :var-type "function",
   :line 230,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "node",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L64",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/node",
   :doc "Returns the node at loc",
   :var-type "function",
   :line 64,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "path",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L90",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/path",
   :doc "Returns a seq of nodes leading to this loc",
   :var-type "function",
   :line 90,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "prev",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L246",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/prev",
   :doc
   "Moves to the previous loc in the hierarchy, depth-first. If already\nat the root, returns nil.",
   :var-type "function",
   :line 246,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "remove",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L264",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/remove",
   :doc
   "Removes the node at loc, returning the loc that would have preceded\nit in a depth-first walk.",
   :var-type "function",
   :line 264,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc node]),
   :name "replace",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L203",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/replace",
   :doc "Replaces the node at this loc, without moving",
   :var-type "function",
   :line 203,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "right",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L149",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/right",
   :doc
   "Returns the loc of the right sibling of the node at this loc, or nil",
   :var-type "function",
   :line 149,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "rightmost",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L157",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/rightmost",
   :doc
   "Returns the loc of the rightmost sibling of the node at this loc, or self",
   :var-type "function",
   :line 157,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "rights",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L102",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/rights",
   :doc "Returns a seq of the right siblings of this loc",
   :var-type "function",
   :line 102,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "root",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L137",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/root",
   :doc
   "zips all the way up and returns the root node, reflecting any\nchanges.",
   :var-type "function",
   :line 137,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([root]),
   :name "seq-zip",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L35",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/seq-zip",
   :doc "Returns a zipper for nested sequences, given a root sequence",
   :var-type "function",
   :line 35,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([loc]),
   :name "up",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L123",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/up",
   :doc
   "Returns the loc of the parent of the node at this loc, or nil if at\nthe top",
   :var-type "function",
   :line 123,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([root]),
   :name "vector-zip",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L44",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/vector-zip",
   :doc "Returns a zipper for nested vectors, given a root vector",
   :var-type "function",
   :line 44,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([root]),
   :name "xml-zip",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L53",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/xml-zip",
   :doc
   "Returns a zipper for xml elements (as from xml/parse),\ngiven a root element",
   :var-type "function",
   :line 53,
   :file "src/clj/clojure/zip.clj"}
  {:arglists ([branch? children make-node root]),
   :name "zipper",
   :namespace "clojure.zip",
   :source-url
   "https://github.com/clojure/clojure/blob/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj#L18",
   :added "1.0",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/59b65669860a1f33825775494809e5d500c19c63/src/clj/clojure/zip.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.zip-api.html#clojure.zip/zipper",
   :doc
   "Creates a new zipper structure. \n\nbranch? is a fn that, given a node, returns true if can have\nchildren, even if it currently doesn't.\n\nchildren is a fn that, given a branch node, returns a seq of its\nchildren.\n\nmake-node is a fn that, given an existing node and a seq of\nchildren, returns a new branch node with the supplied children.\nroot is the root node.",
   :var-type "function",
   :line 18,
   :file "src/clj/clojure/zip.clj"}
  {:file "src/clj/clojure/core/protocols.clj",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/d2fce54ccfcf46815524c2af94d1939573c1e9a9/src/clj/clojure/core/protocols.clj",
   :source-url
   "https://github.com/clojure/clojure/blob/d2fce54ccfcf46815524c2af94d1939573c1e9a9/src/clj/clojure/core/protocols.clj#L11",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core.protocols/InternalReduce",
   :namespace "clojure.core.protocols",
   :line 11,
   :var-type "protocol",
   :doc
   "Protocol for concrete seq types that can reduce themselves\nfaster than first/next recursion. Called by clojure.core/reduce.",
   :name "InternalReduce"}
  {:file nil,
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://clojure.github.com/clojure//clojure.core-api.html#clojure.core.protocols/internal-reduce",
   :namespace "clojure.core.protocols",
   :var-type "function",
   :arglists ([seq f start]),
   :doc nil,
   :name "internal-reduce"}
  {:arglists ([& body]),
   :name "with-junit-output",
   :namespace "clojure.test.junit",
   :source-url
   "https://github.com/clojure/clojure/blob/fbe0183713b92b2f96a68e2a0d0d654bb7ce93ff/src/clj/clojure/test/junit.clj#L182",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/fbe0183713b92b2f96a68e2a0d0d654bb7ce93ff/src/clj/clojure/test/junit.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test.junit/with-junit-output",
   :doc
   "Execute body with modified test-is reporting functions that write\nJUnit-compatible XML output.",
   :var-type "macro",
   :line 182,
   :file "src/clj/clojure/test/junit.clj"}
  {:arglists ([data]),
   :name "print-tap-diagnostic",
   :namespace "clojure.test.tap",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/test/tap.clj#L51",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/test/tap.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test.tap/print-tap-diagnostic",
   :doc
   "Prints a TAP diagnostic line.  data is a (possibly multi-line)\nstring.",
   :var-type "function",
   :line 51,
   :file "src/clj/clojure/test/tap.clj"}
  {:arglists ([msg]),
   :name "print-tap-fail",
   :namespace "clojure.test.tap",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/test/tap.clj#L65",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/test/tap.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test.tap/print-tap-fail",
   :doc
   "Prints a TAP 'not ok' line.  msg is a string, with no line breaks",
   :var-type "function",
   :line 65,
   :file "src/clj/clojure/test/tap.clj"}
  {:arglists ([msg]),
   :name "print-tap-pass",
   :namespace "clojure.test.tap",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/test/tap.clj#L59",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/test/tap.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test.tap/print-tap-pass",
   :doc
   "Prints a TAP 'ok' line.  msg is a string, with no line breaks",
   :var-type "function",
   :line 59,
   :file "src/clj/clojure/test/tap.clj"}
  {:arglists ([n]),
   :name "print-tap-plan",
   :namespace "clojure.test.tap",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/test/tap.clj#L45",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/test/tap.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test.tap/print-tap-plan",
   :doc
   "Prints a TAP plan line like '1..n'.  n is the number of tests",
   :var-type "function",
   :line 45,
   :file "src/clj/clojure/test/tap.clj"}
  {:arglists ([& body]),
   :name "with-tap-output",
   :namespace "clojure.test.tap",
   :source-url
   "https://github.com/clojure/clojure/blob/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/test/tap.clj#L110",
   :added "1.1",
   :raw-source-url
   "https://github.com/clojure/clojure/raw/c1c39162608551d50cfb18998d015974b11cfecc/src/clj/clojure/test/tap.clj",
   :wiki-url
   "http://clojure.github.com/clojure//clojure.test-api.html#clojure.test.tap/with-tap-output",
   :doc
   "Execute body with modified test reporting functions that produce\nTAP output",
   :var-type "macro",
   :line 110,
   :file "src/clj/clojure/test/tap.clj"})}
