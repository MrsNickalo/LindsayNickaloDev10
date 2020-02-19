\version "2.18.2" \score { { \clef bass 
g4  d2 g4  g2 
 fis4  g2 g4  g2 
 g4  d2 g4  g2 
 fis4  g2~ .g2  g4 
  b4. g8 b8 g8 
  \bar "" \break 
 g2 g4  g2 e8 
 g8  g2 g4  g2 
 g8 b8  d'2 c'4 
  b2~ .b2   }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }