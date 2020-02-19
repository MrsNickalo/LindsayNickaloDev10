\version "2.18.2" \score { { \clef treble 
d'4  g'2 b'8 g'8 
  b'2 a'4  g'2 e'4 
  d'2 d'4  g'2 b'8 
 g'8  b'2 a'4  d''2~ 
 .d''2  b'4  d''4. b'8 
  \bar "" \break 
d''8 b'8  g'2 d'4 
  e'4. g'8 g'8 e'8 
  d'2 d'4  g'2 b'8 
 g'8  b'2 a'4  g'2~ 
 .g'2   }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }