from django.shortcuts import render
from django.http import HttpResponse,JsonResponse
from .models import Producto

def inicio(request): 
    return render(request,'productos/inicio.html')

def fin(request): 
    return HttpResponse("Adios que te vaya bien")

def listarCatalogo(request):
    productos=Producto.objects.all()
    return render(request,'productos/catalogo.html',{'arregloproductos':productos})

def listarCatalogoJson(request): 
    productos=list(Producto.objects.values())
    return JsonResponse(productos,safe=False)

def listarCatalogoFiltradoPrecio(request):
    productos=list(
        Producto.objects.filter(precio__gt=100).values()
    )
    
    return JsonResponse(productos,safe=False)

