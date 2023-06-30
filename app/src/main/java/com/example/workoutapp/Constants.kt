package com.example.workoutapp

object Constants {

    fun cardioExerciseList():ArrayList<Exercise> {
        val cardioexerciseList = ArrayList<Exercise>()
        val exCardio1 = Exercise(1, "Jumping Jacks", R.drawable.ic_cardio1,"60sec")
        cardioexerciseList.add(exCardio1)
        val exCardio2 = Exercise(2, "Squats", R.drawable.ic_cardio2,"20 powtórzeń")
        cardioexerciseList.add(exCardio2)
        val exCardio3 = Exercise(3, "Jumps", R.drawable.ic_cardio3,"60sec")
        cardioexerciseList.add(exCardio3)
        val exCardio4 = Exercise(4, "Running", R.drawable.ic_cardio4,"60sec")
        cardioexerciseList.add(exCardio4)
        val exCardio5 = Exercise(5, "Jumping Squats", R.drawable.ic_cardio5,"10 powtórzeń")
        cardioexerciseList.add(exCardio5)
        val exCardio6 = Exercise(6, "Kicking", R.drawable.ic_cardio6,"20 powtórzeń")
        cardioexerciseList.add(exCardio6)
        val exCardio7 = Exercise(7, "One Leg Squats", R.drawable.ic_cardio7,"10 powtórzeń")
        cardioexerciseList.add(exCardio7)
        val exCardio8 = Exercise(8, "One Leg Push-ups", R.drawable.ic_cardio8,"10 powtórzeń")
        cardioexerciseList.add(exCardio8)

        return cardioexerciseList
    }

    fun coreExerciseList():ArrayList<Exercise> {
        val coreexerciseList = ArrayList<Exercise>()
        val exCore1 = Exercise(9, "Crunch", R.drawable.ic_core1,"20 powtórzeń")
        coreexerciseList.add(exCore1)
        val exCore2 = Exercise(10, "Ball Bridge", R.drawable.ic_core2,"20 powtórzeń")
        coreexerciseList.add(exCore2)
        val exCore3 = Exercise(11, "Leg Lift", R.drawable.ic_core3,"20 powtórzeń")
        coreexerciseList.add(exCore3)
        val exCore4 = Exercise(12, "One Leg Bridge", R.drawable.ic_core4,"20 powtórzeń")
        coreexerciseList.add(exCore4)
        val exCore5 = Exercise(13, "Side Leg Lift", R.drawable.ic_core5,"20 powtórzeń")
        coreexerciseList.add(exCore5)
        val exCore6 = Exercise(14, "Side Body Lift", R.drawable.ic_core6,"20 powtórzeń")
        coreexerciseList.add(exCore6)
        val exCore7 = Exercise(15, "Rolling", R.drawable.ic_core7,"60sec")
        coreexerciseList.add(exCore7)
        val exCore8 = Exercise(16, "Cross Over Tap Crunch", R.drawable.ic_core8,"20 powtórzeń")
        coreexerciseList.add(exCore8)

        return coreexerciseList
    }
    fun lowerExerciseList():ArrayList<Exercise> {
        val lowerexerciseList = ArrayList<Exercise>()
        val exLower1 = Exercise(17, "One Leg Squat", R.drawable.ic_lower1,"20 powtórzeń")
        lowerexerciseList.add(exLower1)
        val exLower2 = Exercise(18, "Squats With Weight", R.drawable.ic_lower2,"10 powtórzeń")
        lowerexerciseList.add(exLower2)
        val exLower3 = Exercise(19, "Dumbbell Step-up", R.drawable.ic_lower3,"30 powtórzeń")
        lowerexerciseList.add(exLower3)
        val exLower4 = Exercise(20, "Bulgarian Split Squat", R.drawable.ic_lower4,"20 powtórzeń")
        lowerexerciseList.add(exLower4)
        val exLower5 = Exercise(21, "Front Squats", R.drawable.ic_lower5,"10 powtórzeń")
        lowerexerciseList.add(exLower5)
        val exLower6 = Exercise(22, "Lunge", R.drawable.ic_lower6,"10 powtórzeń")
        lowerexerciseList.add(exLower6)
        val exLower7 = Exercise(23, "Toe Raise", R.drawable.ic_lower7,"30 powtórzeń")
        lowerexerciseList.add(exLower7)
        val exLower8 = Exercise(24, "Side Steps", R.drawable.ic_lower8,"60sec")
        lowerexerciseList.add(exLower8)

        return lowerexerciseList
    }
    fun upperExerciseList():ArrayList<Exercise>{
        val upperexerciseList = ArrayList<Exercise>()
        val exUpper1 = Exercise(1,"Dumbbell Bench Press",R.drawable.ic_upper1,"10 powtórzeń")
        upperexerciseList.add(exUpper1)
        val exUpper2 = Exercise(2,"Dumbbell Curls",R.drawable.ic_upper2,"10 powtórzeń na stronę")
        upperexerciseList.add(exUpper2)
        val exUpper3 = Exercise(3,"Front Raise",R.drawable.ic_upper3,"10 powtórzeń")
        upperexerciseList.add(exUpper3)
        val exUpper4 = Exercise(4,"Developpe Incline Altere",R.drawable.ic_upper4,"10 powtórzeń")
        upperexerciseList.add(exUpper4)
        val exUpper5 = Exercise(5,"Triceps Extension",R.drawable.ic_upper5,"10 powtórzeń")
        upperexerciseList.add(exUpper5)
        val exUpper6 = Exercise(6,"Triceps Kickback",R.drawable.ic_upper6,"10 powtórzeń")
        upperexerciseList.add(exUpper6)
        val exUpper7 = Exercise(7,"Upright Bardell Row",R.drawable.ic_upper7,"5 powtórzeń")
        upperexerciseList.add(exUpper7)
        val exUpper8 = Exercise(8,"Push-ups",R.drawable.ic_upper8,"20 powtórzeń")
        upperexerciseList.add(exUpper8)

        return upperexerciseList

    }

}