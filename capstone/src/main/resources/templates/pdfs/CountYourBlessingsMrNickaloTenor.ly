\version "2.18.2" \score { { \clef bass 
a8 a8 a8 a8 
 d'8 a8 a8 a8 
  a4 a4 a2  a8 
 a8 a8 a8 a8 
 a8 a8 a8  a4 
  \bar "" \break 
d'4 d'2  a8 a8 
 a8 a8 d'8 a8 
 a8 a8  a4 a4 
 a2  a8 a8 a8 
 a8 a8 a8 a8 
  \bar "" \break 
a8  a4 g4 fis2 
  d'8 d'8 d'8 d'8 
 a8 a4.  a8 a8 
 a8 a8 a2  a8 
 a8 a8 a8 a8 
  \bar "" \break 
a4.  a8 a8 a8 
 a8 d'2  a8 a8 
 a8 d'8 d'8 d'4. 
  e'4 e'4 d'4 d'4 
  cis'1  d'8 d'8 d'8 
  \bar "" \break 
d'8 d'8 d'8 b8 
 b8  a4 g4 fis2 
   }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }