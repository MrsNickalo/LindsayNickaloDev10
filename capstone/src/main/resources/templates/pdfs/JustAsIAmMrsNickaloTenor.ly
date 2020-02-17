\version "2.18.2" \score { { \clef bass 
fis8 g8  a2 a4 
  a2 a4  a2 a4 
  a2 d'4  cis'2 a4 
  a2 cis'4  d'2 d'4 
  a2 fis8 g8  a2 
  \bar "" \break 
a4  a2 d'4  d'2 
 d'4  b4 cis'8 d'4 
  d'2 d'4  a2 a4 
  a2  a2  a2 r4 
   }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }