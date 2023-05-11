package com.example.repository

import com.example.models.ApiResponse
import com.example.models.Hero

const val PREV_PAGE_KEY = "prevPage"
const val NEXT_PAGE_KEY = "nextPage"

class HeroRepositoryImpl: HeroRepository {

    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }

    override val page1 = listOf(
        Hero(
            id = 1,
            name = "name1",
            image = "/images/image1.jpg",
            about = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3")),
        Hero(
            id = 2,
            name = "name2",
            image = "/images/image2.jpg",
            about = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3")),
        Hero(
            id = 3,
            name = "name3",
            image = "/images/image3.jpg",
            about = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3"))
    )
    override val page2 = listOf(
        Hero(
            id = 4,
            name = "name4",
            image = "/images/image4.jpg",
            about = "about1",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3")),
        Hero(
            id = 5,
            name = "name5",
            image = "/images/image5.jpg",
            about = "about1",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3")),
        Hero(
            id = 6,
            name = "name6",
            image = "/images/image6.jpg",
            about = "about1",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3"))
    )
    override val page3 = listOf(
        Hero(
            id = 7,
            name = "name7",
            image = "/images/image7.jpg",
            about = "about1",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3")),
        Hero(
            id = 8,
            name = "name8",
            image = "/images/image8.jpg",
            about = "about1",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3")),
        Hero(
            id = 9,
            name = "name9",
            image = "/images/image9.jpg",
            about = "about1",
            rating = 5.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3"))
    )
    override val page4 = listOf(
        Hero(
            id = 10,
            name = "name10",
            image = "/images/image10.jpg",
            about = "about1",
            rating = 3.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3")),
        Hero(
            id = 11,
            name = "name11",
            image = "/images/image11.jpg",
            about = "about1",
            rating = 1.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3")),
        Hero(
            id = 12,
            name = "name12",
            image = "/images/image12.jpg",
            about = "about1",
            rating = 4.1,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3"))
    )
    override val page5 = listOf(
        Hero(
            id = 13,
            name = "name13",
            image = "/images/image13.jpg",
            about = "about1",
            rating = 4.2,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3")),
        Hero(
            id = 14,
            name = "name14",
            image = "/images/image14.jpg",
            about = "about1",
            rating = 2.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3")),
        Hero(
            id = 15,
            name = "name15",
            image = "/images/image15.jpg",
            about = "about1",
            rating = 3.0,
            power = 98,
            month = "July",
            day = "23rd",
            family = listOf("f1", "f2", "f3"),
            abilities = listOf("a1", "a2", "a3"),
            natureType = listOf("n1", "n2", "n3"))
    )

    override suspend fun getAllHeroes(page: Int): ApiResponse {
        return ApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(page)[PREV_PAGE_KEY],
            nextPage = calculatePage(page)[NEXT_PAGE_KEY],
            heroes = heroes[page]!!,
            lastUpdated = System.currentTimeMillis()
        )
    }

    override suspend fun searchHeroes(name: String?): ApiResponse {

        return ApiResponse(
            success = true,
            message = "ok",
            heroes = findHeroes(name)
        )
    }

    private fun calculatePage(page: Int): Map<String, Int?>
    {
        var prevPage: Int? = page
        var nextPage: Int? = page

        if (page in 1..4)
            nextPage = nextPage?.plus(1)

        if (page in 2..5)
            prevPage = prevPage?.minus(1)

        if (page == 5)
            nextPage = null

        if (page == 1)
            prevPage = null

        return mapOf(PREV_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    private fun findHeroes(query: String?): List<Hero>
    {
        val founded = mutableListOf<Hero>()

        return if (!query.isNullOrEmpty())
        {
            heroes.forEach{ (_, heroes) ->

                heroes.forEach {hero ->
                    if (hero.name.lowercase().contains(query.lowercase()))
                        founded.add(hero)
                }
            }
            founded
        }
        else
            emptyList()
    }
}