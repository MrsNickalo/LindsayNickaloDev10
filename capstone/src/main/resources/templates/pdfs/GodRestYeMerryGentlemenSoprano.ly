\version "2.18.2" \score { { \clef treble 
c'4  c'4 g'4 g'4 
 f'4  ees'4 d'4 c'4 
 bes4  c'4 d'4 ees'4 
 f'4  g'2 c'4  c'4 
 g'4 g'4 f'4  ees'4 
  \bar "" \break 
d'4 c'4 bes4  c'4 
 d'4 ees'4 f'4  g'2 
 g'4  aes'4 f'4 g'4 
 aes'4  bes'4 c''4 g'4 
 f'4  ees'4 c'4 d'4 
  \bar "" \break 
ees'4  f'2 ees'4 f'4 
  g'2 aes'4 g'4  g'4 
 f'4 ees'4 d'4  c'2 
 ees'8 d'8 c'4  f'2 
 ees'4 f'4  g'4 aes'4 
  \bar "" \break 
bes'4 c''4  g'4 f'4 
 ees'4 d'4  c'2  }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }