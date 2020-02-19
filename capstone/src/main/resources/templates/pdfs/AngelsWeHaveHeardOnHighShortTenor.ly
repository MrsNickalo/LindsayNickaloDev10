\version "2.18.2" \score { { \clef bass 
c'4 c'4 c'4 c'4 
  d'4 c'4 c'2  c'4 
 c'4 c'4 c'4  c'4. 
 bes8 a2  c'4 c'4 
 c'4 c'4  d'4 c'4 
  \bar "" \break 
c'2  c'4 c'4 c'4 
 c'4  c'4. bes8 a2 
  a2 d'2~ d'2  c'2~ 
 c'2 bes2  g4 f4 
 e2  f4 c'4 c'4 
  \bar "" \break 
d'4  c'2 c'2  a2 
 d'2~ d'2  c'2~ c'2 
 bes2  g4 f4 e2 
  f4 c'4 c'4 d'4 
  c'2. bes4  a1  }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }