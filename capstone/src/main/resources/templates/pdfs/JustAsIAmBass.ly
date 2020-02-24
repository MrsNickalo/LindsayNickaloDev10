\version "2.18.2" \score { { \clef bass 
d4  d2 d4  d2 
 d4  a,2 a,4  d2 
 d4  a2 a4  a2 
 a,4  d2  }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }