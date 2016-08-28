// Temperature.scala
import com.atomicscala.AtomicTest._

class Temperature {
    var current = 0.0
    var scale = "f"
    def setFarenheit(now:Double):Unit = {
        current = now
        scale = "f"
    }
    def setCelsius(now:Double):Unit = {
        current = now
        scale = "c"
    }
    def getFarenheit():Double = {
        if (scale == "f")
            current
        else
            current * 9.0 / 5.0 + 32.0
    }
    def gerCelsius():Double = {
        if (scale == "c")
            current
        else
            (current - 32.0) * 5.0 / 9.0
    }
}

val temp = new Temperature
temp.setFarenheit(98.6)
temp.getFarenheit() is 98.6
temp.gerCelsius is 37.0
temp.setCelsius(100)
temp.getFarenheit is 212.0