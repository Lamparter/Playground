using Microsoft.UI.Xaml.Controls;
using CommunityToolkit.WinUI.Controls;

using WASDKTemplate.ViewModels;

namespace WASDKTemplate.Views;

public sealed partial class MainPage : Page
{
    public MainViewModel ViewModel
    {
        get;
    }

    public MainPage()
    {
        ViewModel = App.GetService<MainViewModel>();
        InitializeComponent();
    }
}
