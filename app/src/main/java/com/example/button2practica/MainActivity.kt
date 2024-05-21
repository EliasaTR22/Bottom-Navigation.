package com.example.button2practica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.ScaleAnimation
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private var selectedTab: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeLayout: LinearLayout = findViewById(R.id.HomeLayout)
        val likeLayout: LinearLayout = findViewById(R.id.LikeLayout)
        val notificationLayout: LinearLayout = findViewById(R.id.NotificacionsLayout)
        val profileLayout: LinearLayout = findViewById(R.id.ProfileLayout)

        val homeImage: ImageView = findViewById(R.id.HomeImage)
        val likeImage: ImageView = findViewById(R.id.LikeImage)
        val notificationImage: ImageView = findViewById(R.id.NotificacionsImage)
        val profileImage: ImageView = findViewById(R.id.ProfileImage)

        val homeTxt: TextView = findViewById(R.id.HomeTxt)
        val likeTxt: TextView = findViewById(R.id.LikeTxt)
        val notificationTxt: TextView = findViewById(R.id.NotificacionsTxt)
        val profileTxt: TextView = findViewById(R.id.ProfileTxt)

        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .replace(R.id.fragmentContainer, HomeFragment::class.java, null)
            .commit()



        homeLayout.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                if (selectedTab != 1) {

                    supportFragmentManager.beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragmentContainer, HomeFragment::class.java, null)
                        .commit()

                    likeTxt.visibility = View.GONE
                    notificationTxt.visibility = View.GONE
                    profileTxt.visibility = View.GONE

                    likeImage.setImageResource(R.drawable.baseline_favorite_24)
                    notificationImage.setImageResource(R.drawable.baseline_notifications_24)
                    profileImage.setImageResource(R.drawable.baseline_account_circle_24)

                    likeLayout.setBackgroundColor(ContextCompat.getColor(this@MainActivity, android.R.color.transparent))
                    notificationLayout.setBackgroundColor(ContextCompat.getColor(this@MainActivity, android.R.color.transparent))
                    profileLayout.setBackgroundColor(ContextCompat.getColor(this@MainActivity, android.R.color.transparent))

                    homeTxt.visibility = View.VISIBLE
                    homeImage.setImageResource(R.drawable.baseline_home_selected_24)
                    homeLayout.setBackgroundResource(R.drawable.round_back_home_100)

                    val scaleAnimation = ScaleAnimation(
                        0.8f, 1.0f,
                        0.8f, 1.0f,
                        ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
                        ScaleAnimation.RELATIVE_TO_SELF, 0.5f
                    )
                    scaleAnimation.duration = 200
                    scaleAnimation.fillAfter = true
                    homeLayout.startAnimation(scaleAnimation)

                    selectedTab = 1
                }
            }
        })

        likeLayout.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                if (selectedTab != 2) {

                    supportFragmentManager.beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragmentContainer, LikeFragment::class.java, null)
                        .commit()

                    homeTxt.visibility = View.GONE
                    notificationTxt.visibility = View.GONE
                    profileTxt.visibility = View.GONE

                    homeImage.setImageResource(R.drawable.baseline_home_24)
                    notificationImage.setImageResource(R.drawable.baseline_notifications_24)
                    profileImage.setImageResource(R.drawable.baseline_account_circle_24)

                    homeLayout.setBackgroundColor(ContextCompat.getColor(this@MainActivity, android.R.color.transparent))
                    notificationLayout.setBackgroundColor(ContextCompat.getColor(this@MainActivity, android.R.color.transparent))
                    profileLayout.setBackgroundColor(ContextCompat.getColor(this@MainActivity, android.R.color.transparent))

                    likeTxt.visibility = View.VISIBLE
                    likeImage.setImageResource(R.drawable.baseline_favorite_selected_24)
                    likeLayout.setBackgroundResource(R.drawable.round_back_favorite_100)

                    val scaleAnimation = ScaleAnimation(
                        0.8f, 1.0f,
                        0.8f, 1.0f,
                        ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
                        ScaleAnimation.RELATIVE_TO_SELF, 0.5f
                    )
                    scaleAnimation.duration = 200
                    scaleAnimation.fillAfter = true
                    likeLayout.startAnimation(scaleAnimation)

                    selectedTab = 2
                }
            }
        })

        notificationLayout.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                if (selectedTab != 3) {

                    supportFragmentManager.beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragmentContainer, NotificationFragment::class.java, null)
                        .commit()

                    homeTxt.visibility = View.GONE
                    likeTxt.visibility = View.GONE
                    profileTxt.visibility = View.GONE

                    homeImage.setImageResource(R.drawable.baseline_home_24)
                    likeImage.setImageResource(R.drawable.baseline_favorite_24)
                    profileImage.setImageResource(R.drawable.baseline_account_circle_24)

                    homeLayout.setBackgroundColor(ContextCompat.getColor(this@MainActivity, android.R.color.transparent))
                    likeLayout.setBackgroundColor(ContextCompat.getColor(this@MainActivity, android.R.color.transparent))
                    profileLayout.setBackgroundColor(ContextCompat.getColor(this@MainActivity, android.R.color.transparent))

                    notificationTxt.visibility = View.VISIBLE
                    notificationImage.setImageResource(R.drawable.baseline_notifications_selected_24)
                    notificationLayout.setBackgroundResource(R.drawable.round_back_notifications_100)

                    val scaleAnimation = ScaleAnimation(
                        0.8f, 1.0f,
                        0.8f, 1.0f,
                        ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
                        ScaleAnimation.RELATIVE_TO_SELF, 0.5f
                    )
                    scaleAnimation.duration = 200
                    scaleAnimation.fillAfter = true
                    notificationLayout.startAnimation(scaleAnimation)

                    selectedTab = 3
                }
            }
        })

        profileLayout.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                if (selectedTab != 4) {

                    supportFragmentManager.beginTransaction()
                        .setReorderingAllowed(true)
                        .replace(R.id.fragmentContainer, ProfileFragment::class.java, null)
                        .commit()

                    homeTxt.visibility = View.GONE
                    likeTxt.visibility = View.GONE
                    notificationTxt.visibility = View.GONE

                    homeImage.setImageResource(R.drawable.baseline_home_24)
                    likeImage.setImageResource(R.drawable.baseline_favorite_24)
                    notificationImage.setImageResource(R.drawable.baseline_notifications_24)

                    homeLayout.setBackgroundColor(ContextCompat.getColor(this@MainActivity, android.R.color.transparent))
                    likeLayout.setBackgroundColor(ContextCompat.getColor(this@MainActivity, android.R.color.transparent))
                    notificationLayout.setBackgroundColor(ContextCompat.getColor(this@MainActivity, android.R.color.transparent))

                    profileTxt.visibility = View.VISIBLE
                    profileImage.setImageResource(R.drawable.baseline_account_circle__selected_24)
                    profileLayout.setBackgroundResource(R.drawable.round_back_account_100)

                    val scaleAnimation = ScaleAnimation(
                        0.8f, 1.0f,
                        0.8f, 1.0f,
                        ScaleAnimation.RELATIVE_TO_SELF, 0.5f,
                        ScaleAnimation.RELATIVE_TO_SELF, 0.5f
                    )
                    scaleAnimation.duration = 200
                    scaleAnimation.fillAfter = true
                    profileLayout.startAnimation(scaleAnimation)

                    selectedTab = 4
                }
            }
        })
    }
}

