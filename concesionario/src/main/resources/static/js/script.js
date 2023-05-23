function validarFormularioMotocicleta() {
        var precioBase = document.getElementById('precioBase').value;
        var cilindrada = document.getElementById('cilindrada').value;
        var peso = document.getElementById('peso').value;
        
        if (precioBase < 0) {
            alert("El precio no puede ser negativo");
            return false;
        }
        
        if (cilindrada < 0) {
            alert("La cilindrada no puede ser negativa");
            return false;
        }
        
        if (peso < 0) {
            alert("El peso no puede ser negativo");
            return false;
        
        return true;
    }
}

function validarFormularioTrabajador() {
    var nombre = document.getElementById('nombre').value;
    var apellidos = document.getElementById('apellidos').value;
    var sueldo = document.getElementById('sueldo').value;
    var telefono = document.getElementById('telefono').value;
    var dni = document.getElementById('dni').value;

    var comprobar = /^[A-Za-záéíóúÁÉÍÓÚ\s]+$/;
	if (!comprobar.test(nombre) || !comprobar.test(apellidos)) {
	    alert('El nombre y los apellidos no pueden contener números.');
	    return false;
	}

    if (sueldo < 0 || sueldo > 100000) {
        alert('El sueldo debe ser un valor positivo y no puede superar los 100000.');
        return false;
    }

    comprobar = /^[\d\s]{8,12}$/;
	if (!comprobar.test(telefono)) {
	    alert('El teléfono debe contener entre 8 y 12 números.');
	    return false;
	}

    var numero = dni.substr(0, dni.length - 1);
    var letra = dni.substr(dni.length - 1, 1);
    numero = numero % 23;
    var letras = 'TRWAGMYFPDXBNJZSQVHLCKET';
    var letraCorrecta = letras.substring(numero, numero + 1);
    if (letra !== letraCorrecta) {
        alert('El DNI no es válido.');
        return false;
    }

    return true;
}

function validarFormularioAccesorio() {
    var precioBase = document.getElementById('precioBase').value;
    
    if (precioBase < 0) {
        alert("El precio no puede ser negativo");
        return false;
    }
}

document.addEventListener("DOMContentLoaded", function() {
    var URLactual = window.location.href;

    var linksNav = document.querySelectorAll(".navbar-nav .nav-link");

    linksNav.forEach(function(link) {
        if (link.href === URLactual) {
            link.classList.add("active");
        }
    });
});








