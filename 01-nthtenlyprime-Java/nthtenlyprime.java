
// nthTenlyPrime(n)
// We will say that a number is 'tenly' (a made-up term) if the digits of the 
// number add up to 10. So 1153 is tenly, but 153 is not. With this in mind, write 
// the function nthTenlyPrime(n) that takes a non-negative int n and returns the 
// nth number that is both tenly and prime. You should also write all the required 
// helper functions. The first several tenly primes are: 19, 37, 73, 109, 127…
import java.lang.Math;

class nthtenlyprime {
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.round((Math.sqrt(n))); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public boolean isTenlyPrime(int n) {
        if (sumOfDigits(n) == 10 && isPrime(n)) {
            return true;
        }
        return false;
    }

    public int fun_nthtenlyprime(int n) {
        int numb = 19;
        int count = 0;
        while (count < n) {
            if (isTenlyPrime(numb)) {
                count += 1;
            }
            numb += 2;
        }
        return numb;
    }
}