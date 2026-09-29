from django.urls import path
from .import views

urlpatterns=[
    path('saludo',views.inicio,name='inicio'),
    path('despedida',views.fin,name='fin'),
    path('listadoproductos',views.listarCatalogo,name='listadoCatalogo'),
    path('listadoproductosjson',views.listarCatalogoJson,name='listadoCatalogoJson'),
    path('listadoproductosjsonfiltrado',views.listarCatalogoFiltradoPrecio,name='listarCatalogoFiltradoPrecio'),
    
             ]