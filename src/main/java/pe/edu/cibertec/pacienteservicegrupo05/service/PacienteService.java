package pe.edu.cibertec.pacienteservicegrupo05.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import pe.edu.cibertec.pacienteservicegrupo05.dto.DiagnosticoDTO;
import pe.edu.cibertec.pacienteservicegrupo05.dto.PacienteHistorialDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
public class PacienteService {

    private final Map<Long, PacienteHistorialDTO> pacientes = Map.of(
            1L, new PacienteHistorialDTO(
                    1L,
                    "70123456",
                    "María Fernanda López",
                    "EPS",
                    List.of(new DiagnosticoDTO(
                            1L,
                            "J00",
                            "Rinofaringitis aguda",
                            LocalDateTime.of(2026, 10, 10, 9, 30),
                            "LEVE"
                    )),
                    "ACTIVO"
            ),
            2L, new PacienteHistorialDTO(
                    2L,
                    "70876543",
                    "José Luis Ramírez",
                    "ESSALUD",
                    List.of(new DiagnosticoDTO(
                            2L,
                            "I10",
                            "Hipertensión esencial",
                            LocalDateTime.of(2026, 10, 10, 10, 15),
                            "MODERADO"
                    )),
                    "ACTIVO"
            )
    );

    public PacienteHistorialDTO obtenerPaciente(Long pacienteId) {
        PacienteHistorialDTO paciente = pacientes.get(pacienteId);
        if (paciente == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Paciente no encontrado");
        }
        return paciente;
    }

    public List<DiagnosticoDTO> obtenerDiagnosticos(Long pacienteId) {
        return obtenerPaciente(pacienteId).listaDiagnosticosActivos();
    }
}
