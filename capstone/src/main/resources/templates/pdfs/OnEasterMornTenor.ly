\version "2.18.2" \score { { \clef bass 
r1  r1  r1  r1 
  c'4 c'4 c'4  c'2 
 c'4  e'2 a4  a2. 
  g4 g4 g4  c'2 
 c'4  a4 a4 c'4 
  \bar "" \break 
 d'2.  b4 c'4 d'4 
  d'4 c'2  b4 b4 
 d'4  c'4 c'2  f4 
 f4 f4  e2 e4 
  f2 f4  e2.  e4 
  \bar "" \break 
f4 a4  g2 g4 
  a2 e4  fis2.  g4 
 f4 f4  e2 g4 
  a4 a4 c'4  d'2. 
  b4 c'4 d'4  d'2 
  \bar "" \break 
c'4  b4 b4 d'4 
  c'2.  f4 f4 f4 
  e2 e4  f4 f4 
 f4  e2.  r2~ r4 
  r2~ r4  r2~ r4 
  \bar "" \break 
 r2~ r4  r2~ r4 
  r2~ r4  r2~ r4 
  r2~ r4  b4 c'4 
 d'4  d'4. c'8 c'4 
  b4 b4 d'4  c'2. 
  \bar "" \break 
 r2~ r4  r2~ r4 
  r2~ r4  r2~ r4 
  g4 g4 g4  aes2 
 b4  b4 b4 b4 
  b2 a4  aes4 aes4 
  \bar "" \break 
aes4  aes4 aes4 aes4 
  aes4 aes4 aes4  aes2. 
  ees4 f4 aes4  bes2 
 g4  g4 a4 b4 
  c'2.  c'4 c'4 d'4 
  \bar "" \break 
 e'2 g4  c'2 c'4 
  b2.  c4 d4 f4 
  g2 g4  a2 e4 
  fis2.  g4 f4 f4 
  e2 g4  a4 a4 
  \bar "" \break 
c'4  d'2.  b4 c'4 
 d'4  d'4 c'2  b4 
 b4 d'4  c'2.  f4 
 f4 f4  e2 e4 
  f4 f4 f4  f2. 
  \bar "" \break 
 f2.~~ f2.~~ f2.~~  r1 
  }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }