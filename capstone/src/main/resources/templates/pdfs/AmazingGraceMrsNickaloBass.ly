\version "2.18.2" \score { { \clef bass 
g,4  g,2 g,8 b,8 
  d2 d4  e2 c4 
  g,2 g,4  g,2 g,8 
 b,8  d2 c4  b,2~ 
 .b,2  g,4  g2 g4 
  \bar "" \break 
 b,2 b,4  c4. b,8 
 c4  g,2 b,4  e2 
 d4  d2 d4  g2~ 
 .g2   }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }