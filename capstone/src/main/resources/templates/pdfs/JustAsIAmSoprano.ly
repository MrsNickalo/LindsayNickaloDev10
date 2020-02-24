\version "2.18.2" \score { { \clef treble 
d'8 e'8  fis'2 fis'4 
  a'4. g'8 fis'4  e'4. 
 fis'8 g'4  fis'2 a'4 
  a'4 e'4 fis'4  g'2 
 b'4  b'2  }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }