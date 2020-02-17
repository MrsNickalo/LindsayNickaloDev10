\version "2.18.2" \score { { \clef treble 
r1  r1  r1  r1 
  c'4 d'4 f'4  e'2 
 e'4  g'2 e'4  d'2 
  d'4 e'4 d'4  a'2 
 g'4  g'4 fis'4 c''4 
  \bar "" \break 
 c''2 b'4  b'4 c''4 
 d''4  d''4 c''2  c''4 
 b'4 gis'4  b'4 a'2 
  c'4 d'4 f'4  e'2 
 g'4  g'4 f'4 b4 
  \bar "" \break 
 c'2  c'4 d'4 f'4 
  e'2 g'4  c''2 e'4 
  d'2  d'4 e'4 d'4 
  a'2 g'4  g'4 fis'4 
 c''4  b'2  b'4 c''4 
  \bar "" \break 
d''4  d''2 c''4  c''4 
 b'4 gis'4  b'4 a'2 
  c'4 d'4 f'4  e'2 
 g'4  g'4 f'4 b4 
  c'2  c'4 d'4 f'4 
  \bar "" \break 
 e'2 g'4  c''2 e'4 
  d'2  d'4 e'4 d'4 
  a'2 g'4  g'4 fis'4 
 c''4  c''2 b'4  b'4 
 c''4 d''4  d''4 c''8 
  \bar "" \break 
c''4  c''4 b'4 gis'4 
  a'2  c'4 d'4 f'4 
  e'2 g'4  g'4 f'4 
 b4  c'2  ees''4 ees''4 
 ees''4  d''2 aes'4  aes'4 
  \bar "" \break 
a'4 aes'4  b'2 a'4 
  a'4 aes'4 b'4  b'4 
 a'4 ges'4  ges'4 e'4 
 ges'4  f'2  ees'4 f'4 
 aes'4  g'2 bes'4  b'4 
  \bar "" \break 
a'4 g'4  e''2  f''4 
 e''4 d''4  g''2 g'4 
  g'2 g'4  g'2  c'4 
 d'4 f'4  e'2 g'4 
  c''2 e'4  d'2  d'4 
  \bar "" \break 
e'4 d'4  a'2 g'4 
  g'4 fis'4 c''4  c''2 
 b'4  b'4 c''4 d''4 
  d''4 c''2  c''4 b'4 
 gis'4  a'2  c'4 d'4 
  \bar "" \break 
f'4  e'2 g'4  g'4 
 f'4 b4  c'2  d'2 
 f'4  c''2~ c''2  r1 
  }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }