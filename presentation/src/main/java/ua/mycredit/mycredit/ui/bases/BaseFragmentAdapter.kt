package ua.mycredit.mycredit.ui.bases

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.ViewGroup

abstract class BaseFragmentAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {

    var currentFragment: Fragment? = null

    open fun onCurrentFragmentChanged(position: Int) {
    }

    override fun setPrimaryItem(container: ViewGroup, position: Int, obj: Any) {
        if (currentFragment != obj) {
            currentFragment = obj as Fragment
            onCurrentFragmentChanged(position)
        }
        super.setPrimaryItem(container, position, obj)
    }
}
