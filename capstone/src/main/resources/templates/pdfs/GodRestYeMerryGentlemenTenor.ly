\version "2.18.2" \score { { \clef bass 
c4  ees2 g2  g2 
 ees4 ees4  ees4 g4 
 g4 c4  d2 c4 
  ees2 g2  g2 ees4 
 ees4  ees4 g4 g4 
  \bar "" \break 
c4  d2 e4  f4 
 d4 ees4 c4  ees4 
 ees4 ees4 d4  ees2 
 f4 g4  bes,2 g2 
  ees2 ees4 ees4  ees4 
  \bar "" \break 
f4 g4 g,4  ees2 
 ees8 ees8 ees4  d2 
 g4 f4  ees4 c4 
 g4 aes4  ees4 f4 
 g4 g,4  ees2  }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }