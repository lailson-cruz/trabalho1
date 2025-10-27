<html>
<head>
<title>Projeto1.java</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #cf8e6d;}
.s1 { color: #bcbec4;}
.s2 { color: #bcbec4;}
.s3 { color: #7a7e85;}
.s4 { color: #2aacb8;}
.s5 { color: #6aab73;}
</style>
</head>
<body bgcolor="#1e1f22">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
Projeto1.java</font>
</center></td></tr></table>
<pre><span class="s0">import </span><span class="s1">java</span><span class="s2">.</span><span class="s1">util</span><span class="s2">.</span><span class="s1">Scanner</span><span class="s2">;</span>

<span class="s0">public class </span><span class="s1">Projeto1 </span><span class="s2">{</span>
    <span class="s0">public static void </span><span class="s1">main</span><span class="s2">(</span><span class="s1">String</span><span class="s2">[] </span><span class="s1">args</span><span class="s2">) {</span>
        <span class="s1">Scanner scanner </span><span class="s2">= </span><span class="s0">new </span><span class="s1">Scanner</span><span class="s2">(</span><span class="s1">System</span><span class="s2">.</span><span class="s1">in</span><span class="s2">);</span>

        <span class="s3">//Declerar variáveis para armezenar as notas</span>
        <span class="s0">double</span><span class="s2">[] </span><span class="s1">notas </span><span class="s2">= </span><span class="s0">new double</span><span class="s2">[</span><span class="s4">8</span><span class="s2">];</span>

        <span class="s3">//entrada das notas</span>
        <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Digite as 8 notas anuais:&quot;</span><span class="s2">);</span>
        <span class="s0">for </span><span class="s2">(</span><span class="s0">int </span><span class="s1">i </span><span class="s2">= </span><span class="s4">0</span><span class="s2">; </span><span class="s1">i </span><span class="s2">&lt; </span><span class="s4">8</span><span class="s2">; </span><span class="s1">i</span><span class="s2">++) {</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">print</span><span class="s2">(</span><span class="s5">&quot;nota&quot; </span><span class="s2">+ (</span><span class="s1">i </span><span class="s2">+ </span><span class="s4">1</span><span class="s2">) + </span><span class="s5">&quot;:&quot;</span><span class="s2">);</span>
            <span class="s1">notas</span><span class="s2">[</span><span class="s1">i</span><span class="s2">] = </span><span class="s1">scanner</span><span class="s2">.</span><span class="s1">nextDouble</span><span class="s2">();</span>
        <span class="s2">}</span>

            <span class="s3">//Calcular médias bimestrais</span>
            <span class="s0">double </span><span class="s1">mediaBimestral1 </span><span class="s2">= (</span><span class="s1">notas</span><span class="s2">[</span><span class="s4">0</span><span class="s2">] + </span><span class="s1">notas</span><span class="s2">[</span><span class="s4">1</span><span class="s2">]) / </span><span class="s4">2</span><span class="s2">;</span>
            <span class="s0">double </span><span class="s1">mediaBimestral2 </span><span class="s2">= (</span><span class="s1">notas</span><span class="s2">[</span><span class="s4">2</span><span class="s2">] + </span><span class="s1">notas</span><span class="s2">[</span><span class="s4">3</span><span class="s2">]) / </span><span class="s4">2</span><span class="s2">;</span>
            <span class="s0">double </span><span class="s1">mediaBimestral3 </span><span class="s2">= (</span><span class="s1">notas</span><span class="s2">[</span><span class="s4">4</span><span class="s2">] + </span><span class="s1">notas</span><span class="s2">[</span><span class="s4">5</span><span class="s2">]) / </span><span class="s4">2</span><span class="s2">;</span>
            <span class="s0">double </span><span class="s1">mediaBimestral4 </span><span class="s2">= (</span><span class="s1">notas</span><span class="s2">[</span><span class="s4">6</span><span class="s2">] + </span><span class="s1">notas</span><span class="s2">[</span><span class="s4">7</span><span class="s2">]) / </span><span class="s4">2</span><span class="s2">;</span>

            <span class="s3">//Calcular médias semestrais</span>
            <span class="s0">double </span><span class="s1">mediaSemestral1 </span><span class="s2">= (</span><span class="s1">mediaBimestral1 </span><span class="s2">+ </span><span class="s1">mediaBimestral2</span><span class="s2">) /</span><span class="s4">2</span><span class="s2">;</span>
            <span class="s0">double </span><span class="s1">mediaSemestral2 </span><span class="s2">= (</span><span class="s1">mediaBimestral3 </span><span class="s2">+ </span><span class="s1">mediaBimestral4</span><span class="s2">) /</span><span class="s4">2</span><span class="s2">;</span>

            <span class="s3">//calcular media final</span>
            <span class="s0">double </span><span class="s1">mediaFinal </span><span class="s2">= (</span><span class="s1">mediaSemestral1 </span><span class="s2">+ </span><span class="s1">mediaSemestral2</span><span class="s2">) / </span><span class="s4">2</span><span class="s2">;</span>

            <span class="s3">//imprimir resultados</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;</span><span class="s0">\n</span><span class="s5">Resultados:&quot;</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;media Bimestral 1:&quot; </span><span class="s2">+ </span><span class="s1">mediaBimestral1</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;media Bimestral 2:&quot; </span><span class="s2">+ </span><span class="s1">mediaBimestral2</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;media Bimestral 3:&quot; </span><span class="s2">+ </span><span class="s1">mediaBimestral3</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;media Bimestral 4:&quot; </span><span class="s2">+ </span><span class="s1">mediaBimestral4</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;media Semestral 1:&quot; </span><span class="s2">+ </span><span class="s1">mediaSemestral1</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;media Semestral 2:&quot; </span><span class="s2">+ </span><span class="s1">mediaSemestral2</span><span class="s2">);</span>
            <span class="s1">System</span><span class="s2">.</span><span class="s1">out</span><span class="s2">.</span><span class="s1">println</span><span class="s2">(</span><span class="s5">&quot;Media Final:&quot; </span><span class="s2">+ </span><span class="s1">mediaFinal</span><span class="s2">);</span>
        <span class="s2">}</span>


    <span class="s2">}</span>

</pre>
</body>
</html>
