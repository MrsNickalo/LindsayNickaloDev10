\version "2.18.2" \score { { \clef bass 
r2 r4 f'8. e'16 
  e'2 r4 c'8. b16 
  b2 r4 g8. a16 
  a2 r4 g8. c'16 
  c'2 r4 f'8. e'16 
  \bar "" \break 
 e'2 r4 c'8. b16 
  b2 r4 g8. a16 
  a2 r4 g8. c'16 
  c'2. r4  r1  r1 
  r1  r1  r1  r1 
  \bar "" \break 
 r1  r1  r2 r4 
 f'8. e'16  e'2 r4 
 c'8. b16  b2 r4 
 g8. a16  a2 r4 
 g8. c'16  c'2 r4 
  \bar "" \break 
f'8. e'16  e'2 r4 
 c'8. b16  b2 r4 
 g8. a16  a2 r4 
 g8. c'16  c'2. r4 
  r1  r1  r1  r1 
  \bar "" \break 
 g2. g4  g2 r4 
 c4  f2. e4  d'2 
 r4 f'8. e'16  e'2 
 r4 c'8. b16  b2 
 r4 c'4  c'2 r4 
  \bar "" \break 
c'8. e'16  e'2 r4 
 f'8. e'16  e'2 r4 
 c'8. b16  b2 r4 
 c'4  c'2 r4 c'8. 
 e'16  e'1  r1  r1 
  \bar "" \break 
 r1  r1  r1  r1 
  r1  r1  r1  r1 
  r1  r1  r4 g16 
 a8 a16~ a16 b8 
 b16~ b16 a8 b16~ 
  \bar "" \break 
b16  c'16 r8 b16 
 c'8 c'16~ c'16 d'8 
 d'16~ d'16 c'8 d'16~ 
 d'16  e'16 r8 r4 
 r2  r1  r4 r8 
  \bar "" \break 
a8 a8 b16 b16~ 
 b16 c'8 c'16~ c'8 
  r16 c'16 c'8 c'16 
 c'16~ c'16 d'8 d'16~ 
 d'16 e'8 e'16~ e'8 
  \bar "" \break 
 r8 r4 r2  r2 
 r4 f'8. e'16  e'2 
 r4 c'8. b16  b2 
 r4 c'4  c'2 r4 
 c'8. e'16  e'2 r4 
  \bar "" \break 
f'8. e'16  e'2 r4 
 c'8. b16  b2 r4 
 c'4  c'2 r4 c'8. 
 e'16  e'2 r4 f'8. 
 e'16  e'2 r4 c'8. 
  \bar "" \break 
b16  b2 r4 c'4 
  c'2 r4 c'8. e'16 
  e'2 r4 f'8. e'16 
  e'2 r4 c'8. b16 
  b2 r4 c'4  c'2 
  \bar "" \break 
d'2  e'2 r4 c'4 
  c'2 d'2  e'2 r4 
 c'4  c'2 d'2  e'1~ 
 e'1  r1   }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }