\version "2.18.2" \score { { \clef treble 
c'4  c'4 ees'4 d'4 
 b4  c'4 bes4 aes4 
 g4  c'4 b4 c'4 
 c'4  b2. c'4  c'4 
 ees'4 d'4 b4  c'4 
  \bar "" \break 
bes4 aes4 g4  c'4 
 b4 c'4 c'4  b2. 
 c'4  c'4 bes4 bes4 
 ees'4  des'4 c'4 bes4 
 b4  c'4 a4 bes4 
  \bar "" \break 
bes4  d'2 e'4 bes4 
  bes2 c'4 bes4  bes4 
 aes4 c'4 b4  c'2 
 g8 g8 a4  bes2 
 bes4 bes4  bes2 bes4 
  \bar "" \break 
ees'4  bes4 aes4 c'4 
 b4  c'2.  }
 \layout { 
 \context { 
 \score 
 \override SpacingSpanner.base-shortest-duration = #(ly:make-moment 1/16) 
 } 
 } 
 
 \paper{oddFooterMarkup=##f page-count = #1} }