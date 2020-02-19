\version "2.18.2" \score { { \clef bass 
d4  d2 d4  d2 
 d4  a,2 a,4  d2 
 d4  a2 a4  a2 
 a,4  d2 d4  d2 
 d4  d2 d4  d4. 
  \bar "" \break 
e8 fis4  g2 g4 
  g2 g4  d2 d4 
  d2 d4  a2.  a,2. 
  d2 r4   }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }