using System;

using UWPTemplate.ViewModels;

using Windows.UI.Xaml.Controls;

namespace UWPTemplate.Views
{
    // For more info about the TabView Control see
    // https://docs.microsoft.com/uwp/api/microsoft.ui.xaml.controls.tabview?view=winui-2.2
    // For other samples, get the XAML Controls Gallery app http://aka.ms/XamlControlsGallery
    public sealed partial class EditorPage : Page
    {
        public EditorViewModel ViewModel { get; } = new EditorViewModel();

        public EditorPage()
        {
            InitializeComponent();
        }
    }
}
