document.addEventListener('DOMContentLoaded', function () {
    // Desplazamiento suave en el menú de navegación
    document.querySelectorAll('nav a').forEach(anchor => {
        anchor.addEventListener('click', function (e) {
            e.preventDefault();
            document.querySelector(this.getAttribute('href')).scrollIntoView({
                behavior: 'smooth'
            });
        });
    });

    // Mensaje emergente al hacer clic en "Conócenos"
    document.getElementById('conocenos-btn')?.addEventListener('click', function () {
        alert('Gracias por tu interés en conocernos. ¡Descubre más en la sección "Nosotros"!');
    });

    // Mensaje emergente al hacer clic en "Contáctanos"
    document.getElementById('contacto-btn')?.addEventListener('click', function () {
        alert('¡Estamos aquí para ayudarte! Encuentra nuestros datos de contacto al final de la página.');
    });

    // Validación y envío del formulario de contacto
    document.getElementById('contact-form')?.addEventListener('submit', function (e) {
        e.preventDefault();

        const name = document.getElementById('name').value.trim();
        const email = document.getElementById('email').value.trim();
        const phone = document.getElementById('phone').value.trim();
        const message = document.getElementById('message').value.trim();

        // Validación de campos vacíos
        if (name === '' || email === '' || phone === '' || message === '') {
            alert('Por favor, completa todos los campos.');
            return;
        }

        // Validación del número de teléfono
        if (!/^[0-9]{10}$/.test(phone)) {
            alert('Por favor, introduce un número telefónico válido (10 dígitos).');
            return;
        }

        // Si todo está bien, muestra mensaje de éxito
        alert('¡Gracias por tu mensaje, ' + name + '! Nos pondremos en contacto contigo pronto.');
        // Aquí puedes agregar el código para enviar el formulario al servidor
    });

    // Efectos de hover sobre las imágenes de la galería
    document.querySelectorAll('.galeria img').forEach(img => {
        img.addEventListener('mouseover', () => {
            img.style.transform = 'scale(1.05)';
            img.style.transition = 'transform 0.3s ease';
        });

        img.addEventListener('mouseout', () => {
            img.style.transform = 'scale(1)';
        });
    });
});


