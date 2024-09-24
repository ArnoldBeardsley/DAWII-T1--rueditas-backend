package pe.edu.cibertec.rueditas_backend.service;

import pe.edu.cibertec.rueditas_backend.dto.AutoRequest;

import java.io.IOException;

public interface AutoService {
    String[] validarVehiculo(AutoRequest request) throws IOException;
}
