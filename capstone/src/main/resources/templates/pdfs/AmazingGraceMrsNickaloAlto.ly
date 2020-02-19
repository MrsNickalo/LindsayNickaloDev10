\version "2.18.2" \score { { \clef treble 
b4  b2 d'4  d'2 
 c'4  b2 c'4  b2 
 b4  b2 d'4  d'2 
 d'4  d'2~ .d'2  d'4 
  d'2 d'4  d'2 d'4 
  \bar "" \break 
 c'4. d'8 c'4  b2 
 d'4  b'2 d'4  g'2 
 fis'4  d'2~ .d'2   }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }