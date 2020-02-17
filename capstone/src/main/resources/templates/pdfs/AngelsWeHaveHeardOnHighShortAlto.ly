\version "2.18.2" \score { { \clef treble 
f'4 f'4 e'4 e'4 
  g'4 e'4 f'2  f'4 
 e'4 f'4 f'4  f'4 
 e'4 f'2  f'4 f'4 
 e'4 e'4  f'4 g'4 
  \bar "" \break 
f'2  f'4 e'4 f'4 
 f'4  f'4 e'4 f'2 
  f'4 a'8 g'8 f'2~ 
 f'4  g'8 f'8 e'2~ 
 e'4  f'8 e'8 d'2 
  \bar "" \break 
 c'4 c'8 c'2  c'4 
 e'4 f'4 f'4  f'2 
 e'2  f'4 a'8 g'8 
 f'2~ f'4  g'8 f'8 
 e'2~ e'4  f'8 e'8 
  \bar "" \break 
d'2  c'4 c'8 c'2 
  c'4 e'4 f'4 f'4 
  f'2 e'2  c'1  }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }