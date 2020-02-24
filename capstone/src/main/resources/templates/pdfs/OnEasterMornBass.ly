\version "2.18.2" \score { { \clef bass 
r1  r1  r1  r1 
  c'4 c'4 c'4  c'2 
 b4  a2 a4  a2. 
  g4 g4 g4  e2 
 e4  d4 d4 d4 
  \bar "" \break 
 g2.  f4 f4 f4 
  e2.  gis4 gis4 gis4 
  a4 a2  a,4 a,4 
 a,4  g,2 g,4  g,2 
 g,4  c2.  c4 c4 
  \bar "" \break 
c4  c2 b,4  a,2 
 a,4  a,2.  g,4 g,4 
 g,4  g,2 g,4  d4 
 d4 d4  g2.  f4 
 f4 f4  e2 e4 
  \bar "" \break 
 gis4 gis4 gis4  a2. 
  a,4 a,4 a,4  g,2 
 g,4  g,4 g,4 g,4 
  c2.  r2~ r4  r2~ 
 r4  r2~ r4  r2~ 
  \bar "" \break 
r4  r2~ r4  r2~ 
 r4  r2~ r4  r2~ 
 r4  f4 f4 f4 
  e4. e8 e4  gis4 
 gis4 gis4  a2.  r2~ 
  \bar "" \break 
r4  r2~ r4  r2~ 
 r4  r2~ r4  c4 
 c4 c4  f2 f4 
  d4 d4 d4  cis2 
 cis4  c4 c4 c4 
  \bar "" \break 
 b,4 b,4 b,4  bes,4 
 bes,4 bes,4  bes,2.  ees4 
 ees4 ees4  ees2 ees4 
  d4 d2  c2.  a,4 
 a,4 aes,4  g,2 g4 
  \bar "" \break 
 g2 g4  g2.  c4 
 c4 c4  c2 b,4 
  a,2 a,4  a,2.  g,4 
 g,4 g,4  g,2 c4 
  d4 d4 d4  g2. 
  \bar "" \break 
 f4 f4 f4  e4 
 e2  gis4 gis4 gis4 
  a2.  a,4 a,4 a,4 
  g,2 g,4  g,4 g,4 
 g,4  c2.  c2.~~ c2.~~ 
  \bar "" \break 
c2.~~  r1  }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }