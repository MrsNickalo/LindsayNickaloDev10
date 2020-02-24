\version "2.18.2" \score { { \clef treble 
fis'8 fis'8 fis'8 g'8 
 a'8 a'8 a'8 fis'8 
  g'4 fis'4 g'2  e'8 
 fis'8 g'8 a'8 cis''8 
 b'8 a'8 g'8  fis'4 
  \bar "" \break 
g'4 a'2  fis'8 fis'8 
 fis'8 g'8 a'8 a'8 
 a'8 fis'8  g'4 fis'4 
 g'2  e'8 fis'8 g'8 
 a'8 cis''8 b'8 a'8 
  \bar "" \break 
g'8  fis'4 e'4 d'2 
  a'4. a'8 d''8 a'8 
 a'8 fis'8  g'4 g'4 
 g'2  g'4. g'8 cis''8 
 b'8 a'8 g'8  fis'4 
  \bar "" \break 
g'4 a'2  d''4. d''8 
 cis''8 b'4.  cis''4 cis''4 
 b'4 b'4  a'1  d''8 
 d''8 cis''8 d''8 cis''8 
 b'8 a'8 g'8  fis'4 
  \bar "" \break 
e'4 d'2   }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }