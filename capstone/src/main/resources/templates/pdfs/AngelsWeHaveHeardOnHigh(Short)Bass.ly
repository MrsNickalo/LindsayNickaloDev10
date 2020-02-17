\version "2.18.2" \score { { \clef bass 
f4 f4 a4 a4 
  g4 c4 f2  f4 
 c4 f4 a4  c'4 
 c4 f2  f4 f4 
 a4 a4  d4 e4 
  \bar "" \break 
f2  f4 c4 f4 
 a,4  c4 c4 f2 
  f2 d4 f4  g2 
 c4 e4  f2 bes,4 
 d4  e4 d4 c4 
  \bar "" \break 
bes,4  a,4 c4 f4 
 bes,4  c2 c2  f2 
 d4 f4  g2 c4 
 e4  f2 bes,4 d4 
  e4 d4 c4 bes,4 
  \bar "" \break 
 a,4 c4 f4 bes,4 
  c1  f1  }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }