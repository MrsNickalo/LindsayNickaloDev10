\version "2.18.2" \score { { \clef treble 
d'8 d'8 d'8 e'8 
 fis'8 fis'8 fis'8 d'8 
  e'4 dis'4 e'2  cis'8 
 d'8 e'8 fis'8 a'8 
 g'8 fis'8 e'8  d'4 
  \bar "" \break 
e'4 fis'2  d'8 d'8 
 d'8 e'8 fis'8 fis'8 
 fis'8 d'8  e'4 dis'4 
 e'2  cis'8 d'8 e'8 
 fis'8 a'8 g'8 fis'8 
  \bar "" \break 
e'8  d'4 cis'4 d'2 
  fis'4. fis'8 fis'8 fis'8 
 fis'8 d'8  e'8 d'8 
 cis'8 b8 a2  e'4. 
 e'8 a'8 g'8 fis'8 
  \bar "" \break 
e'8  d'4 e'4 fis'2 
  fis'4. fis'8 a'8 g'4. 
  g'4 g'4 g'4 g'4 
  g'1  fis'8 fis'8 fis'8 
 fis'8 a'8 g'8 e'8 
  \bar "" \break 
e'8  d'4 cis'4 d'2 
   }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }