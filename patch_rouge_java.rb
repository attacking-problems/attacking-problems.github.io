require 'rouge'

module Rouge
  module Lexers
    class Java < RegexLexer
      # Re-open the existing Java lexer class to append the missing keyword
      # This ensures 'yield' is explicitly tokenized as a keyword
      prepend Module.new {
        def initialize(*)
          super
          # Inject 'yield' directly into the lexer's keyword list if not present
          if defined?(self.class::KEYWORDS) && !self.class::KEYWORDS.include?('yield')
            self.class::KEYWORDS << 'yield'
          end
        end
      }

      # Standard keyword rule definition
      # This ensures Rouge catches it during the regex parsing phase
      state :root do
        mixin :basic
      end

      state :basic do
        rule %r/\b(yield)\b/, Keyword
      end
    end
  end
end