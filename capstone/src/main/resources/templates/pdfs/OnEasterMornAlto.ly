\version "2.18.2" \score { { \clef treble 
r1  r1  r1  r1 
  c'4 d'4 d'4  e'2 
 e'4  g'2 c'4  c'2 
  b4 b4 b4  e'2 
 e'4  c'4 c'4 f'4 
  \bar "" \break 
 g'2  g'4 g'4 g'4 
  g'2  e'4 e'4 e'4 
  f'4 f'2  a4 a4 
 a4  c'2 c'4  b2 
 b4  c'2  c'4 c'4 
  \bar "" \break 
c'4  c'2 d'4  e'2 
 c'4  c'2  b4 b4 
 b4  c'2 e'4  d'4 
 d'4 f'4  g'2  g'4 
 g'4 g'4  g'2 g'4 
  \bar "" \break 
 e'4 e'4 e'4  f'2 
  a4 a4 a4  c'2 
 c'4  b4 b4 b4 
  c'2  c'4 c'4 c'4 
  c'2 e'4  e'2 c'4 
  \bar "" \break 
 c'2  b4 b4 b4 
  e'2  d'4 d'4 fis'4 
  g'2  g'4 g'4 g'4 
  g'4 g'8 g'4  e'4 
 e'4 e'4  f'2  a4 
  \bar "" \break 
a4 a4  c'2 c'4 
  b2 b4  c'2  g'4 
 g'4 g'4  f'2 f'4 
  d'4 d'4 d'4  e'2 
 e'4  ees'4 ees'4 ees'4 
  \bar "" \break 
 ees'4 ees'4 ees'4  ees'4 
 ees'4 ees'4  d'2  ees'4 
 ees'4 ees'4  ees'2 ees'4 
  f'4 f'2  g'2  a'4 
 g'4 f'4  c''2 g'4 
  \bar "" \break 
 e'2 e'4  d'2  c'4 
 c'4 c'4  c'2 d'4 
  e'2 c'4  c'2  b4 
 b4 b4  c'2 e'4 
  d'4 d'4 fis'4  g'2 
  \bar "" \break 
 g'4 g'4 g'4  g'4 
 g'2  e'4 e'4 e'4 
  f'2  a4 a4 a4 
  c'2 c'4  b4 b4 
 b4  a2  c'2 d'4 
  \bar "" \break 
 e'2~ e'2  r1  }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }