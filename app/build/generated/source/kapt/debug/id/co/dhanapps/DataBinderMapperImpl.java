package id.co.dhanapps;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import id.co.dhanapps.databinding.ActivityDetailStudioBindingImpl;
import id.co.dhanapps.databinding.ActivityEditStudioBindingImpl;
import id.co.dhanapps.databinding.ActivityInputPaketBindingImpl;
import id.co.dhanapps.databinding.ActivityLoginBindingImpl;
import id.co.dhanapps.databinding.ActivityMainBindingImpl;
import id.co.dhanapps.databinding.ActivityMapsStudioBindingImpl;
import id.co.dhanapps.databinding.FragmentDaftarStudioBindingImpl;
import id.co.dhanapps.databinding.FragmentHomeBindingImpl;
import id.co.dhanapps.databinding.FragmentProfilBindingImpl;
import id.co.dhanapps.databinding.FragmentSignInBindingImpl;
import id.co.dhanapps.databinding.FragmentSignUpBindingImpl;
import id.co.dhanapps.databinding.ItemDaftarStudioBindingImpl;
import id.co.dhanapps.databinding.ItemKaryaBindingImpl;
import id.co.dhanapps.databinding.ItemPaketBindingImpl;
import id.co.dhanapps.databinding.ItemStudioBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDETAILSTUDIO = 1;

  private static final int LAYOUT_ACTIVITYEDITSTUDIO = 2;

  private static final int LAYOUT_ACTIVITYINPUTPAKET = 3;

  private static final int LAYOUT_ACTIVITYLOGIN = 4;

  private static final int LAYOUT_ACTIVITYMAIN = 5;

  private static final int LAYOUT_ACTIVITYMAPSSTUDIO = 6;

  private static final int LAYOUT_FRAGMENTDAFTARSTUDIO = 7;

  private static final int LAYOUT_FRAGMENTHOME = 8;

  private static final int LAYOUT_FRAGMENTPROFIL = 9;

  private static final int LAYOUT_FRAGMENTSIGNIN = 10;

  private static final int LAYOUT_FRAGMENTSIGNUP = 11;

  private static final int LAYOUT_ITEMDAFTARSTUDIO = 12;

  private static final int LAYOUT_ITEMKARYA = 13;

  private static final int LAYOUT_ITEMPAKET = 14;

  private static final int LAYOUT_ITEMSTUDIO = 15;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(15);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.activity_detail_studio, LAYOUT_ACTIVITYDETAILSTUDIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.activity_edit_studio, LAYOUT_ACTIVITYEDITSTUDIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.activity_input_paket, LAYOUT_ACTIVITYINPUTPAKET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.activity_maps_studio, LAYOUT_ACTIVITYMAPSSTUDIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.fragment_daftar_studio, LAYOUT_FRAGMENTDAFTARSTUDIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.fragment_profil, LAYOUT_FRAGMENTPROFIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.fragment_sign_in, LAYOUT_FRAGMENTSIGNIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.fragment_sign_up, LAYOUT_FRAGMENTSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.item_daftar_studio, LAYOUT_ITEMDAFTARSTUDIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.item_karya, LAYOUT_ITEMKARYA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.item_paket, LAYOUT_ITEMPAKET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(id.co.dhanapps.R.layout.item_studio, LAYOUT_ITEMSTUDIO);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDETAILSTUDIO: {
          if ("layout/activity_detail_studio_0".equals(tag)) {
            return new ActivityDetailStudioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_detail_studio is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYEDITSTUDIO: {
          if ("layout/activity_edit_studio_0".equals(tag)) {
            return new ActivityEditStudioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_edit_studio is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYINPUTPAKET: {
          if ("layout/activity_input_paket_0".equals(tag)) {
            return new ActivityInputPaketBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_input_paket is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAPSSTUDIO: {
          if ("layout/activity_maps_studio_0".equals(tag)) {
            return new ActivityMapsStudioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_maps_studio is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDAFTARSTUDIO: {
          if ("layout/fragment_daftar_studio_0".equals(tag)) {
            return new FragmentDaftarStudioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_daftar_studio is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFIL: {
          if ("layout/fragment_profil_0".equals(tag)) {
            return new FragmentProfilBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profil is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNIN: {
          if ("layout/fragment_sign_in_0".equals(tag)) {
            return new FragmentSignInBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sign_in is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSIGNUP: {
          if ("layout/fragment_sign_up_0".equals(tag)) {
            return new FragmentSignUpBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_sign_up is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDAFTARSTUDIO: {
          if ("layout/item_daftar_studio_0".equals(tag)) {
            return new ItemDaftarStudioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_daftar_studio is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMKARYA: {
          if ("layout/item_karya_0".equals(tag)) {
            return new ItemKaryaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_karya is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPAKET: {
          if ("layout/item_paket_0".equals(tag)) {
            return new ItemPaketBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_paket is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSTUDIO: {
          if ("layout/item_studio_0".equals(tag)) {
            return new ItemStudioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_studio is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "jam");
      sKeys.put(2, "karya");
      sKeys.put(3, "like");
      sKeys.put(4, "paket");
      sKeys.put(5, "pangkalan");
      sKeys.put(6, "tanggal");
      sKeys.put(7, "user");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(15);

    static {
      sKeys.put("layout/activity_detail_studio_0", id.co.dhanapps.R.layout.activity_detail_studio);
      sKeys.put("layout/activity_edit_studio_0", id.co.dhanapps.R.layout.activity_edit_studio);
      sKeys.put("layout/activity_input_paket_0", id.co.dhanapps.R.layout.activity_input_paket);
      sKeys.put("layout/activity_login_0", id.co.dhanapps.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", id.co.dhanapps.R.layout.activity_main);
      sKeys.put("layout/activity_maps_studio_0", id.co.dhanapps.R.layout.activity_maps_studio);
      sKeys.put("layout/fragment_daftar_studio_0", id.co.dhanapps.R.layout.fragment_daftar_studio);
      sKeys.put("layout/fragment_home_0", id.co.dhanapps.R.layout.fragment_home);
      sKeys.put("layout/fragment_profil_0", id.co.dhanapps.R.layout.fragment_profil);
      sKeys.put("layout/fragment_sign_in_0", id.co.dhanapps.R.layout.fragment_sign_in);
      sKeys.put("layout/fragment_sign_up_0", id.co.dhanapps.R.layout.fragment_sign_up);
      sKeys.put("layout/item_daftar_studio_0", id.co.dhanapps.R.layout.item_daftar_studio);
      sKeys.put("layout/item_karya_0", id.co.dhanapps.R.layout.item_karya);
      sKeys.put("layout/item_paket_0", id.co.dhanapps.R.layout.item_paket);
      sKeys.put("layout/item_studio_0", id.co.dhanapps.R.layout.item_studio);
    }
  }
}
