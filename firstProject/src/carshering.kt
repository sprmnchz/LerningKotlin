import kotlin.random.Random


fun main(args: Array<String>) {

    val age = Random.nextInt(1,80)
    val drivingExperience = getDrivingExperience(age)
    val carBrand = getCarBrand()

    println("age = $age")
    println("driving experience = $drivingExperience")
    println(carBrand)
    checkDriver(age, drivingExperience, carBrand)

}



fun checkDriver (age: Int, drivingExperience: Int){

    val car = arrayOf("Kia","Hyundai","Volkswagen")
    val carPrem = arrayOf("BMW","Audi")
    val minAge = 21
    val minDrivingExperience = 2
    val minAgeForPrem = 26
    val minDrivingExperienceForPrem = 6

    if (age>minAge&&drivingExperience>=minDrivingExperience) {
        println("you can take cars of this brands:")
        for (brandCar in car) println(brandCar)
    } else println("you cant take car")
    if (age>minAgeForPrem&&drivingExperience>minDrivingExperienceForPrem) {
        println("and you can take cars of this prem brands:")
        for (brandCar in carPrem) println(brandCar)}
    }

fun checkDriver (age: Int, drivingExperience: Int, brand: String){

    val car = arrayOf("Kia","Hyundai","Volkswagen")
    val carPrem = arrayOf("BMW","Audi")
    val minAge = 21
    val minDrivingExperience = 2
    val minAgeForPrem = 26
    val minDrivingExperienceForPrem = 6

    if (car.contains(brand)){
        if (age>minAge&&drivingExperience>=minDrivingExperience) {
        println("you can take this cars")
        } else println("you cant take this car")
    } else if (carPrem.contains(brand)) {
        if (age>minAgeForPrem&&drivingExperience>minDrivingExperienceForPrem) {
        println("you can take this cars")
        } else println("you cant take this car")
    } else println("This brand not found")
}

fun getDrivingExperience(age: Int): Int {

    var experience: Int

    if (age>18) {
        experience = Random.nextInt(1,62)
        if (experience>age) experience -=age}
    else experience =  0

    return experience
}

fun getCarBrand():String {
    val carArray = arrayOf("Kia","Hyundai","Volkswagen","BMW","Audi")
    return carArray[Random.nextInt(carArray.size)]
}
