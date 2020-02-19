\version "2.18.2" \score { { \clef bass 
c4  c2 b,2  c2 
 aes,4 ees,4  aes,4 g,4 
 c4 aes,4  g,2. c4 
  c2 b,2  c2 aes,4 
 ees,4  aes,4 g,4 c4 
  \bar "" \break 
aes,4  g,2. c4  f4 
 d4 ees4 c4  g,4 
 aes,4 ees,4 g,4  c2 
 bes,4 g,4  bes,2 c4 
 d4  ees2 aes,4 ees4 
  \bar "" \break 
 ees4 f4 g4 g,4 
  c2 c8 c8 c4 
  bes,2 g4 f4  ees4 
 c4 g,4 aes,4  ees4 
 f4 g4 g,4  c2. 
  \bar "" \break 
 }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }