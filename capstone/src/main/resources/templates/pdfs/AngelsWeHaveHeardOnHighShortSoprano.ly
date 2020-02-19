\version "2.18.2" \score { { \clef treble 
a'4 a'4 a'4 c''4 
  c''4. bes'8 a'2  a'4 
 g'4 a'4 c''4  a'4. 
 g'8 f'2  a'4 a'4 
 a'4 c''4  c''4. bes'8 
  \bar "" \break 
a'2  a'4 g'4 a'4 
 c''4  a'4. g'8 f'2 
  c''2 d''8 c''8 bes'8 
 a'8  bes'2 c''8 bes'8 
 a'8 g'8  a'2 bes'8 
  \bar "" \break 
a'8 g'8 f'8  g'4. 
 c'8 c'2  f'4 g'4 
 a'4 bes'4  a'2 g'2 
  c''2 d''8 c''8 bes'8 
 a'8  bes'2 c''8 bes'8 
  \bar "" \break 
a'8 g'8  a'2 bes'8 
 a'8 g'8 f'8  g'4. 
 c'8 c'2  f'4 g'4 
 a'4 bes'4  a'2 g'2 
  f'1  }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }