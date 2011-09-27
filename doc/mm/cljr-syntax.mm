<map version="0.9.0">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node COLOR="#000000" CREATED="1316769854929" ID="ID_1266180824" MODIFIED="1316775934655" STYLE="fork" TEXT="cljr-syntax">
<font NAME="SansSerif" SIZE="20"/>
<hook NAME="accessories/plugins/AutomaticLayout.properties"/>
<node COLOR="#0033ff" CREATED="1316769871785" ID="ID_1601020217" MODIFIED="1316775739757" POSITION="right" TEXT="comment">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316769899573" ID="ID_304188834" MODIFIED="1316775739761">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      ;text
    </p>
    <p>
      (for line comment)
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316769914959" ID="ID_724596445" MODIFIED="1316775739764">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      (comment test)
    </p>
    <p>
      macro for block comment
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316769945167" ID="ID_1441122101" MODIFIED="1316775739766" POSITION="left" TEXT="character literal">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316769961759" ID="ID_1579090606" MODIFIED="1316775739767" TEXT="\char \tab \newline">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316769982365" ID="ID_1877609084" MODIFIED="1316775739771">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      (char ascii-code)
    </p>
    <p>
      (char \uunicode)
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316770148698" ID="ID_1982918722" MODIFIED="1316775739772" POSITION="right" TEXT="string">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316770158586" ID="ID_1430955860" MODIFIED="1316775739774" TEXT="&quot;text&quot;">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316770169783" ID="ID_1305347741" MODIFIED="1316775739775" TEXT="(str char1 char2)">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316770189017" ID="ID_1036495596" MODIFIED="1316775739776" POSITION="left" TEXT="keyword">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316770194466" ID="ID_1075681484" MODIFIED="1316775739777" TEXT=":keyword-name">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316770204541" ID="ID_1548232917" MODIFIED="1316775739779" TEXT="(keyword keyword-name">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316770232899" ID="ID_743234555" MODIFIED="1316775739780" POSITION="right" TEXT="keyword resolved">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316770242094" ID="ID_74971553" MODIFIED="1316775739781" TEXT="::keyword-name">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316770313907" ID="ID_512516739" MODIFIED="1316775739783" POSITION="left" TEXT="regular expression">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316770326480" ID="ID_913638861" MODIFIED="1316775739785" TEXT="#&quot;pattern&quot;">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316770338641" ID="ID_242331852" MODIFIED="1316775739786" TEXT="(re-pattern pattern)">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316770387965" ID="ID_149665747" MODIFIED="1316775739787" POSITION="right" TEXT="treated as whitespace">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316770405595" ID="ID_1541076401" MODIFIED="1316775739789" TEXT=", (a comma)">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316770421999" ID="ID_1281610816" MODIFIED="1316775739790" POSITION="left" TEXT="list - linked list">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316770432114" ID="ID_753283379" MODIFIED="1316775739828">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      '(item1 item2 item3)
    </p>
    <p>
      does not evaluate items
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316770448111" ID="ID_987545616" MODIFIED="1316775739847">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      (list item1 item2 item3)
    </p>
    <p>
      evaluates items
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316770525979" ID="ID_121841635" MODIFIED="1316775739848" POSITION="right" TEXT="vector (similar to array)">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316770557480" ID="ID_885105321" MODIFIED="1316775739852" TEXT="[item1 item2 item3]">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316770570191" ID="ID_659082071" MODIFIED="1316775739854" TEXT="(vector item1 item2 items)">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316770614295" ID="ID_1998415241" MODIFIED="1316775739855" POSITION="left" TEXT="set">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316770618397" ID="ID_1320642135" MODIFIED="1316775739859">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      #{item1 item2 item3}
    </p>
    <p>
      create hash-set
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316770651397" ID="ID_618214156" MODIFIED="1316775739862">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      (hash-set item1 item2 item3)
    </p>
    <p>
      (sorted-set item1 item2 item3)
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316771642299" ID="ID_1114407723" MODIFIED="1316775739864" POSITION="right" TEXT="map">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316771646801" ID="ID_158434066" MODIFIED="1316775739868">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      {key value key value}
    </p>
    <p>
      creates hashmap
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316771705580" ID="ID_300373736" MODIFIED="1316775739875">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      (hash-map key value key value)
    </p>
    <p>
      (sorted-map key value key value)
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316771772053" ID="ID_93872005" MODIFIED="1316775761706" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      add metadata to
    </p>
    <p>
      symbol or Collection
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316771820263" ID="ID_1660516484" MODIFIED="1316775739883">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      #^{key value key value} object
    </p>
    <p>
      processed at runtime
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316771869926" ID="ID_1669266069" MODIFIED="1316775739887">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      (with-meta object meta-data-map)
    </p>
    <p>
      processes at runtime
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316772000707" ID="ID_196234972" MODIFIED="1316775857849" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      get metadatamap for
    </p>
    <p>
      symbol or Collection
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316772030751" ID="ID_1589392010" MODIFIED="1316775739890" TEXT="^object">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316772042519" ID="ID_1617722842" MODIFIED="1316775739891" TEXT="(meta object)">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316772070456" ID="ID_1866417350" MODIFIED="1316775777259" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      gather a variable
    </p>
    <p>
      number of arguments
    </p>
    <p>
      in a function parameter list
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316772093246" ID="ID_401694115" MODIFIED="1316775739897" TEXT="&amp; name">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316772118558" ID="ID_1237526435" MODIFIED="1316775856075" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      conventional name given to
    </p>
    <p>
      function parameters
    </p>
    <p>
      that aren't used
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316772153903" ID="ID_502590510" MODIFIED="1316775739902" TEXT="_(an underscore)">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316772322436" ID="ID_1163311164" MODIFIED="1316775817645" POSITION="left">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      construct a Java object;
    </p>
    <p>
      note period after
    </p>
    <p>
      the class name
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316773114073" ID="ID_1021986801" MODIFIED="1316775739915" TEXT="(class-name. args)">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316773135238" ID="ID_1690264210" MODIFIED="1316775739916" TEXT="(new class-name args)">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316775314806" ID="ID_1198523712" MODIFIED="1316775739917" POSITION="right" TEXT="call a Java method">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316775334249" ID="ID_577409691" MODIFIED="1316775739927">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      (. class-or-instance method-name args)
    </p>
    <p>
      or&#160;
    </p>
    <p>
      (.method-name class-or-instance args)
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316775386962" ID="ID_513223908" MODIFIED="1316775739929" POSITION="left" TEXT="call several Java methods">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316775398772" ID="ID_1396877118" MODIFIED="1316775739935">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      (.. class-or-object (method1 args)
    </p>
    <p>
      (method2 args) ...)
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316775437975" ID="ID_778676750" MODIFIED="1316775865755" POSITION="right" TEXT="create an anonymous function">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316775449603" ID="ID_120696696" MODIFIED="1316775739955">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      <code style="font-family: Courier New, sans-serif"><font face="Verdana, sans-serif" size="medium" color="rgb(0, 0, 0)"><span style="font-family: Verdana, sans-serif" class="Apple-style-span">#(<i>single-expression</i>)</span></font></code><font face="Verdana, sans-serif" size="medium" color="rgb(0, 0, 0)"><span style="font-family: Verdana, sans-serif" class="Apple-style-span"><br style="font-variant: normal; white-space: normal; text-indent: 0px; text-transform: none; line-height: normal; word-spacing: 0px; letter-spacing: normal" align="-webkit-auto" />use</span><span class="Apple-converted-space">&#160;</span><code style="font-family: Courier New, sans-serif"><span style="font-family: Verdana, sans-serif" class="Apple-style-span">%</span></code><span class="Apple-converted-space">&#160;</span><span style="font-family: Verdana, sans-serif" class="Apple-style-span">(same as</span><span class="Apple-converted-space">&#160;</span><code style="font-family: Courier New, sans-serif"><span style="font-family: Verdana, sans-serif" class="Apple-style-span">%1</span></code><span style="font-family: Verdana, sans-serif" class="Apple-style-span">),</span><span class="Apple-converted-space">&#160;</span><code style="font-family: Courier New, sans-serif"><span style="font-family: Verdana, sans-serif" class="Apple-style-span">%1</span></code><span style="font-family: Verdana, sans-serif" class="Apple-style-span">,</span><span class="Apple-converted-space">&#160;</span><code style="font-family: Courier New, sans-serif"><span style="font-family: Verdana, sans-serif" class="Apple-style-span">%2</span></code><span class="Apple-converted-space">&#160; </span></font>
    </p>
    <p>
      <font face="Verdana, sans-serif" size="medium" color="rgb(0, 0, 0)"><span style="font-family: Verdana, sans-serif" class="Apple-style-span">and so on for arguments</span></font>
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316775471757" ID="ID_1682379949" MODIFIED="1316775739958" TEXT="(fn [arg-names] expressions)">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316775486433" ID="ID_1861976919" MODIFIED="1316775739960" POSITION="left" TEXT="dereference a Ref, Atom or Agent">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316775499353" ID="ID_1558773331" MODIFIED="1316775739961" TEXT="@ref">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316775509201" ID="ID_463593776" MODIFIED="1316775739962" TEXT="(deref ref)">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316775525405" ID="ID_1390779149" MODIFIED="1316775739968" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      get Var object instead of
    </p>
    <p>
      the value of a symbol (var-quote)
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316775551608" ID="ID_327061464" MODIFIED="1316775739970" TEXT="#&apos;name">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316775555383" ID="ID_1640837516" MODIFIED="1316775739971" TEXT="(var name)">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316775572504" ID="ID_1430056264" MODIFIED="1316775739972" POSITION="left" TEXT="syntax quote (used in macros)">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316775595007" ID="ID_763472210" MODIFIED="1316775739974" TEXT="` (back quote)">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316775621313" ID="ID_1234846016" MODIFIED="1316775739977" POSITION="right" TEXT="unquote (used in macros)">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316775634933" ID="ID_1924358976" MODIFIED="1316775739978" TEXT="~value">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316775638787" ID="ID_1212681017" MODIFIED="1316775739980" TEXT="(unquote value)">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316775657179" ID="ID_955240596" MODIFIED="1316775739981" POSITION="left" TEXT="unquote splicing (used in macros)">
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316775679068" ID="ID_830496097" MODIFIED="1316775739983" TEXT="~@value">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
<node COLOR="#0033ff" CREATED="1316775691788" ID="ID_912833761" MODIFIED="1316775882349" POSITION="right">
<richcontent TYPE="NODE"><html>
  <head>
    
  </head>
  <body>
    <p>
      auto-gensym
    </p>
    <p>
      (used in macros to generate
    </p>
    <p>
      a unique symbol name)
    </p>
  </body>
</html>
</richcontent>
<edge STYLE="sharp_bezier" WIDTH="8"/>
<font NAME="SansSerif" SIZE="18"/>
<node COLOR="#00b439" CREATED="1316775720351" ID="ID_535218047" MODIFIED="1316775739990" TEXT="prefix#">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
<node COLOR="#00b439" CREATED="1316775729909" ID="ID_600976375" MODIFIED="1316775739991" TEXT="(gensym prefix?)">
<edge STYLE="bezier" WIDTH="thin"/>
<font NAME="SansSerif" SIZE="16"/>
</node>
</node>
</node>
</map>
