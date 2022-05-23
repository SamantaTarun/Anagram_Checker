import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.booleans.shouldBeFalse

class AnagramCheckerTest : StringSpec() {
    init {
        "is 'aa' an anagram of 'a' when comparing same character with same frequency" {
            AnagramChecker().match("a", "a").shouldBeTrue()
        }

        "is 'b' an anagram of 'a' when comparing different string with same length" {
            AnagramChecker().match("A", "a").shouldBeTrue()
        }
        "is 'v' an anagram of 'a' when comparing different character" {
            AnagramChecker().match("b", "a").shouldBeFalse()
        }

        "is 'z' an anagram of 'a'" {
            AnagramChecker().match("vv", "bn").shouldBeFalse()
        }

        "is 'x' an anagram of 'y' when comparing with different length" {
            AnagramChecker().match("x", "xc").shouldBeFalse()
        }


    }
}
