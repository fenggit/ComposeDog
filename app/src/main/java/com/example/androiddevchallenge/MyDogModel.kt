/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MyDogModel : ViewModel() {
    val dogs by mutableStateOf(
        listOf(
            MyDog(
                "Harley", "Griffon Nivernais: Dog Breed Profile", R.mipmap.img_dog1
            ),
            MyDog(
                "Riley", "Mountain Cur: Dog Breed Profile", R.mipmap.img_dog2
            ),
            MyDog(
                "Stella", "Does My Dog Need Pet Insurance?", R.mipmap.img_dog3
            ),
            MyDog(
                "Duke", "Mountain Cur: Dog Breed Profile", R.mipmap.img_dog4
            ),
            MyDog(
                "Zeus", "Does My Dog Need Pet Insurance?", R.mipmap.img_dog5
            ),
            MyDog(
                "Bowen", "Mountain Dog & Shepherd Mix", R.mipmap.img_dog6
            ),
            MyDog(
                "Gracie", "Mountain Cur: Dog Breed Profile", R.mipmap.img_dog7
            ),
            MyDog(
                "Mikey", "Does My Dog Need Pet Insurance?", R.mipmap.img_dog8
            )
        )
    )

    var currentDog: MyDog? by mutableStateOf(null)

    fun showDog(dog: MyDog) {
        currentDog = dog
    }

    fun back() {
        currentDog = null
    }
}
