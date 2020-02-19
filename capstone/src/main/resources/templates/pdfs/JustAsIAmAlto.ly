\version "2.18.2" \score { { \clef treble 
d'8 e'8  d'2 d'4 
  fis'4. e'8 d'4  cis'4. 
 d'8 e'4  d'2 fis'4 
  e'2 d'4  e'2 g'4 
  g'2 fis'4  d'2 d'8 
  \bar "" \break 
e'8  d'2 d'4  fis'4. 
 e'8 d'4  g'2 g'4 
  g'2 g'4  fis'2 fis'4 
  fis'4. e'8 d'4  cis'2. 
  cis'2.  d'2 r4   }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }