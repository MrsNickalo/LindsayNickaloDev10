\version "2.18.2" \score { { \clef bass 
d8 d8 d8 d8 
 d8 d8 d8 d8 
  a,4 a,4 a,2  a,8 
 a,8 a,8 a,8 a,8 
 a,8 a,8 a,8  d4 
  \bar "" \break 
d4 d2  d8 d8 
 d8 d8 d8 d8 
 d8 d8  a,4 a,4 
 a,2  a,8 a,8 a,8 
 a,8 a,8 a,8 a,8 
  \bar "" \break 
a,8  a,4 a,4 d2 
  d8 d8 d8 d8 
 d8 d4.  a,8 a,8 
 a,8 a,8 a,2  a,8 
 a,8 a,8 a,8 a,8 
  \bar "" \break 
a,4.  d8 d8 d8 
 d8 d2  d8 d8 
 d8 d8 g8 g4. 
  a4 a4 a4 a4 
  a1  d8 d8 d8 
  \bar "" \break 
d8 g8 g8 g8 
 g8  a4 g4 fis2 
   }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }