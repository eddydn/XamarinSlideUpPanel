using Android.App;
using Android.Widget;
using Android.OS;
using Android.Support.V7.App;

namespace XamarinSlideUpPanel
{
    [Activity(Label = "XamarinSlideUpPanel", MainLauncher = true, Icon = "@drawable/icon",Theme ="@style/Theme.AppCompat.Light.NoActionBar")]
    public class MainActivity : AppCompatActivity
    {
        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);
            SetContentView (Resource.Layout.Main);
        }
    }
}

