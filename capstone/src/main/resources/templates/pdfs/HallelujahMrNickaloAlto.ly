\version "2.18.2" \score { { \clef treble 
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
a'8. g'16  g'2 r4 
 e'8. d'16  d'2 r4 
 c'4  c'2 r4 c'8. 
 e'16  e'2. r4  r1 
  r1  r1  r1  c'2. 
  \bar "" \break 
c'4  b2 r4 c'4 
  f'2. e4  g'2 r4 
 a'8. g'16  g'2 r4 
 e'8. d'16  d'2 r4 
 e'8. f'16  f'2 r4 
  \bar "" \break 
e'8. a'16  a'2 r4 
 a'8. g'16  g'2 r4 
 e'8. d'16  d'2 r4 
 e'8. f'16  f'2 r4 
 e'8. a'16  a'1  r1 
  \bar "" \break 
 r1  r1  r1  r1 
  r1  r1  r1  r1 
  r1  r1  r1  r4 
 g16 a8 a16~ a16 
 b8 b16~ b16 a8 
  \bar "" \break 
b16~ b16  c'16 r8 
 b16 c'8 c'16~ c'16 
 d'8 d'16~ d'16 c'8 
 d'16~ d'16  e'16 r8 
 r4 r2  r1  r4 
  \bar "" \break 
r8 a8 a8 b16 
 b16~ b16 c'8 c'16~ 
 c'8  r16 c'16 c'8 
 c'16 c'16~ c'16 d'8 
 d'16~ d'16 e'8 e'16~ 
  \bar "" \break 
e'8  r8 r4 r2 
  r2 r4 a'8. g'16 
  g'2 r4 e'8. d'16 
  d'2 r4 e'8. f'16 
  f'2 r4 e'8. a'16 
  \bar "" \break 
 a'2 r4 a'8. g'16 
  g'2 r4 e'8. d'16 
  d'2 r4 e'8. f'16 
  f'2 r4 e'8. a'16 
  a'2 r4 a'8. g'16 
  \bar "" \break 
 g'16~ g'16 g'8 g'16~ 
 g'8 g'8 r4  r8. 
 g'16~ g'16 g'8 g'16~ 
 g'8 g'8 r4  g'16~ 
 g'16 g'8 g'16~ g'8 
  \bar "" \break 
g'8 r4  r8. a'16~ 
 a'16 a'8 a'16~ a'8 
 a'8 r4  r8. g'16~ 
 g'16 g'8 g'16~ g'8 
 g'8 r4  r8. g'16~ 
  \bar "" \break 
g'16 g'8 g'16~ g'8 
 g'8 r4  r8. g'16~ 
 g'16 g'8 g'16~ g'8 
 g'8 r4  r8. g'16~ 
 g'16 g'8 g'16~ g'8 
  \bar "" \break 
g'8 r4  r8. g'16~ 
 g'16 g'8 g'16~ g'8 
 g'8 r4  r8. g'16~ 
 g'16 g'8 g'16~ g'8 
 g'8 e'8. f'16  f'2 
  \bar "" \break 
g'2  g'1~ g'1  r1 
   }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }